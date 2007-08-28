/*
 * Created on Aug 23, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.plugin.api.model.impl;

import org.homeunix.thecave.buddi.model.DataModel;
import org.homeunix.thecave.buddi.plugin.api.model.MutableAccount;
import org.homeunix.thecave.buddi.plugin.api.model.MutableBudgetCategory;
import org.homeunix.thecave.buddi.plugin.api.model.MutableModel;
import org.homeunix.thecave.buddi.plugin.api.model.MutableScheduledTransaction;
import org.homeunix.thecave.buddi.plugin.api.model.MutableTransaction;
import org.homeunix.thecave.buddi.plugin.api.model.MutableType;

public class MutableModelImpl extends ImmutableModelImpl implements MutableModel {

	public MutableModelImpl(DataModel model) {
		super(model);
	}

	public void addAccount(MutableAccount account) {
		getModel().addAccount(account.getAccount());
	}

	public void addBudgetCategory(MutableBudgetCategory budgetCategory) {
		getModel().addBudgetCategory(budgetCategory.getBudgetCategory());
	}

	public void addScheduledTransaction(MutableScheduledTransaction scheduledTransaction) {
		getModel().addScheduledTransaction(scheduledTransaction.getScheduledTransaction());		
	}

	public void addTransaction(MutableTransaction transaction) {
		getModel().addTransaction(transaction.getTransaction());
	}

	public void addType(MutableType type) {
		getModel().addType(type.getType());
	}

	public void removeAccount(MutableAccount account) {
		getModel().removeAccount(account.getAccount());
	}

	public void removeBudgetCategory(MutableBudgetCategory budgetCategory) {
		getModel().removeBudgetCategory(budgetCategory.getBudgetCategory());
	}

	public void removeScheduledTransaction(MutableScheduledTransaction scheduledTransaction) {
		getModel().removeScheduledTransaction(scheduledTransaction.getScheduledTransaction());		
	}

	public void removeTransaction(MutableTransaction transaction) {
		getModel().removeTransaction(transaction.getTransaction());
	}

	public void removeType(MutableType type) {
		getModel().removeType(type.getType());
	}
}