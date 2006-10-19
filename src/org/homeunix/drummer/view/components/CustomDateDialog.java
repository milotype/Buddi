/*
 * Created on May 20, 2006 by wyatt
 */
package org.homeunix.drummer.view.components;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.homeunix.drummer.Const;
import org.homeunix.drummer.controller.Translate;
import org.homeunix.drummer.controller.TranslateKeys;
import org.homeunix.drummer.plugins.BuddiPluginHelper;
import org.homeunix.drummer.plugins.BuddiPluginHelper.DateRangeType;
import org.homeunix.drummer.plugins.interfaces.BuddiPanelPlugin;
import org.homeunix.drummer.prefs.PrefsInstance;
import org.homeunix.drummer.view.AbstractDialog;
import org.homeunix.thecave.moss.util.DateUtil;
import org.homeunix.thecave.moss.util.Log;

import com.toedter.calendar.JDateChooser;

/**
 * The dialog which allows users to choose a custom date range, or
 * start / end date only.  Designed to launch a plugin when the user 
 * has chosen the date.
 * 
 * @author wyatt
 *
 */
public class CustomDateDialog extends AbstractDialog {
	public static final long serialVersionUID = 0;

	protected final JButton okButton;
	protected final JButton cancelButton;

	protected final JLabel mainLabel;
	protected final JLabel middleLabel;

	protected final JDateChooser startDateChooser;
	protected final JDateChooser endDateChooser;

	protected final BuddiPanelPlugin plugin;


	public CustomDateDialog(Frame owner, BuddiPanelPlugin plugin){
		super(owner);

		this.plugin = plugin;

		okButton = new JButton(Translate.getInstance().get(TranslateKeys.OK));
		cancelButton = new JButton(Translate.getInstance().get(TranslateKeys.CANCEL));

		Dimension buttonSize = new Dimension(100, okButton.getPreferredSize().height);
		okButton.setPreferredSize(buttonSize);
		cancelButton.setPreferredSize(buttonSize);

		startDateChooser = new JDateChooser();
		endDateChooser = new JDateChooser();

		startDateChooser.setDateFormatString(PrefsInstance.getInstance().getPrefs().getDateFormat());
		endDateChooser.setDateFormatString(PrefsInstance.getInstance().getPrefs().getDateFormat());

		Dimension textFieldSize = new Dimension(180, startDateChooser.getPreferredSize().height);

		startDateChooser.setPreferredSize(textFieldSize);
		endDateChooser.setPreferredSize(textFieldSize);

		startDateChooser.setDate(new Date());
		endDateChooser.setDate(new Date());

		JPanel r1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel r2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		mainLabel = new JLabel();
		middleLabel = new JLabel(); 

		r1.add(mainLabel);

		r2.add(startDateChooser);
		r2.add(middleLabel);
		r2.add(endDateChooser);

		JPanel textPanelSpacer = new JPanel();
		textPanelSpacer.setLayout(new BoxLayout(textPanelSpacer, BoxLayout.Y_AXIS));
		textPanelSpacer.setBorder(BorderFactory.createEmptyBorder(7, 17, 17, 17));
		textPanelSpacer.add(r1);
		textPanelSpacer.add(r2);

		JPanel mainBorderPanel = new JPanel();
		mainBorderPanel.setLayout(new BorderLayout());
		mainBorderPanel.setBorder(BorderFactory.createTitledBorder(""));
		mainBorderPanel.add(textPanelSpacer);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(cancelButton);
		buttonPanel.add(okButton);

		JPanel mainPanel = new JPanel(); 
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(7, 12, 12, 12));

		mainPanel.add(mainBorderPanel, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);

		this.setLayout(new BorderLayout());
		this.add(mainPanel);
		this.getRootPane().setDefaultButton(okButton);
		this.setTitle(Translate.getInstance().get(TranslateKeys.CHOOSE_DATE_INTERVAL));

		setVisibility();

		//Call the method to add actions to the buttons
		initActions();	
	}

	private void setVisibility(){
		if (plugin.getDateRangeType().equals(DateRangeType.INTERVAL)){
			mainLabel.setText(Translate.getInstance().get(TranslateKeys.REPORT_BETWEEN));
			middleLabel.setText(Translate.getInstance().get(TranslateKeys.AND));					
		}
		else{
			mainLabel.setText(Translate.getInstance().get(TranslateKeys.REPORT_AS_OF_DATE));
			middleLabel.setVisible(false);

			if (plugin.getDateRangeType().equals(DateRangeType.START_ONLY))
				endDateChooser.setVisible(false);
			else if (plugin.getDateRangeType().equals(DateRangeType.END_ONLY))
				startDateChooser.setVisible(false);
		}
	}


	@Override
	protected AbstractDialog clearContent() {
		return this;
	}
	@Override
	protected AbstractDialog initActions() {
		okButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				Date startDate, endDate;

//				if (plugin.getDateRangeType().equals(DateRangeType.INTERVAL)){
				startDate = DateUtil.getStartOfDay(startDateChooser.getDate());
				endDate = DateUtil.getEndOfDay(endDateChooser.getDate());
//				}
//				else if (plugin.getDateRangeType().equals(DateRangeType.START_ONLY)){
//				startDate = DateUtil.getStartOfDay(startDateChooser.getDate());
//				}
//				else if (plugin.getDateRangeType().equals(DateRangeType.END_ONLY)){
//				endDate = DateUtil.getEndOfDay(endDateChooser.getDate());
//				}


				if (plugin.getDateRangeType().equals(DateRangeType.INTERVAL)
						&& endDate.before(startDate)){
					JOptionPane.showMessageDialog(
							null, 
							Translate.getInstance().get(TranslateKeys.START_DATE_AFTER_END_DATE), 
							Translate.getInstance().get(TranslateKeys.REPORT_DATE_ERROR), 
							JOptionPane.ERROR_MESSAGE
					);
					return;
				}

				if (Const.DEVEL) Log.debug("Getting transactions between " + startDate + " and " + endDate);

				BuddiPluginHelper.openNewPanelPluginWindow(plugin, startDate, endDate);

				CustomDateDialog.this.setVisible(false);
			}
		});

		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				CustomDateDialog.this.setVisible(false);
			}
		});

		return this;
	}
	@Override
	protected AbstractDialog initContent() {
		return this;
	}
	@Override
	public AbstractDialog updateButtons() {
		return this;
	}
	@Override
	protected AbstractDialog updateContent() {
		return this;
	}
}
