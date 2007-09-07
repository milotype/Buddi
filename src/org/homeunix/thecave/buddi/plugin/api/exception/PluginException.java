/*
 * Created on Aug 3, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.plugin.api.exception;


/**
 * The exception thrown when there is a problem with a plugin.
 * 
 * @author wyatt
 *
 */
public class PluginException extends Exception {
	public static final long serialVersionUID = 0;
	
	public PluginException() {
		super();
	}
	public PluginException(String message) {
		super(message);
	}
	public PluginException(Throwable cause) {
		super(cause);
	}
	public PluginException(String message, Throwable cause) {
		super(message, cause);
	}
}
