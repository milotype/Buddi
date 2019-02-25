/* 
 * Copyright 2005 Paul Hinds
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tp23.antinstaller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.tp23.antinstaller.input.ConditionalField;
import org.tp23.antinstaller.input.InputField;
import org.tp23.antinstaller.input.OutputField;
import org.tp23.antinstaller.input.SecretPropertyField;
import org.tp23.antinstaller.page.Page;



/**
 *
 * <p>Outputs the completed Pages as a java Properties file. </p>
 * @author Paul Hinds
 * @version $Id: DefaultPropertiesFileRenderer.java,v 1.8 2007/01/09 22:41:41 teknopaul Exp $
 */
public class DefaultPropertiesFileRenderer
	implements PropertiesFileRenderer {

	public DefaultPropertiesFileRenderer() {
	}

	public void renderProperties(InstallerContext ctx, File baseDir){
		Installer installer = ctx.getInstaller();
		Page[] completedPages = installer.getPages();
		Properties props = new Properties();
		props.put(FILE_ROOT_PROPERTY, baseDir.getAbsolutePath());
        props.setProperty(INSTALLER_VERSION_PROPERTY,
                ctx.getInstaller().getVersion());


		for (int i = 0; i < completedPages.length; i++) {
			OutputField[] fields = completedPages[i].getOutputField();

            retrieveProperties( fields, props );
			
			// print targets selected
			List targets = completedPages[i].getTargets(ctx);
			if(targets.size() > 0){
				Iterator iterator = targets.iterator();
				StringBuffer targetProperty = new StringBuffer();
				while (iterator.hasNext()) {
					String target = (String) iterator.next();
					targetProperty.append(target).append(",");
				}
				props.put(completedPages[i].getName() + TARGETS_SUFFIX, targetProperty.toString());				
			}

		}
		try {
			File antInstallProperties = new File(baseDir.getAbsolutePath(), PROPERTIES_FILE_NAME);
            FileOutputStream fos = new FileOutputStream(antInstallProperties);
			props.store(fos,
						"Ant Installer - AutoGenerated properties");
            fos.close();
		}
		catch (Throwable ex) {
            if(ctx.getInstaller().isVerbose()) {
                ctx.log(ex);
            }
			//swallow Exceptions as in contract for this method
		}
	}

    private void retrieveProperties( OutputField[] fields, Properties props ) {
        for (int f = 0; f < fields.length; f++) {
            if (fields[f] instanceof SecretPropertyField) {
                //InputField field = (InputField)fields[f];
                //props.put(field.getProperty(), "XXXXXXXX");
            }
            else if( fields[f] instanceof ConditionalField ) {
                ConditionalField confField = (ConditionalField) fields[f];
                retrieveProperties( confField.getFields(), props );
            }
            else if (fields[f] instanceof InputField) {
                InputField field = (InputField)fields[f];

                String result = field.getInputResult();
                //Temporary fix for PR 1353906
                if( result == null ) {
                    result = "";
                }
                props.put(field.getProperty(), result);
            }
        }
    }
}