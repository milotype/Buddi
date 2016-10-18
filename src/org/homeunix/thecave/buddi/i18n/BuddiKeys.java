/*
 * Created on Jun 2, 2006 by wyatt
 */
package org.homeunix.thecave.buddi.i18n;

/**
 * I use this list of keys for the Translate class.  Using this instead 
 * of string constants gives me more flexibility and less ugly code
 * that I have to wade through. 
 * @author wyatt
 *
 */
public enum BuddiKeys {
	ABOUT_BUDDI,
	ABOUT_COPYRIGHT,
	ABOUT_EMAIL,
	ABOUT_GPL,
	ABOUT_TEXT,
	ABOUT_TRANSLATION,
	ABOUT_VERSION,
	ACCOUNT,
	ACCOUNTS_COMBOBOX_HEADER,
	ACCOUNT_AND_CATEGORY_SUMMARY,
	ACCOUNT_EDITOR_ERROR_UPDATING_ACCOUNT,
	ACCOUNT_EDITOR_EXPENSE,
	ACCOUNT_EDITOR_INCOME,
	ACCOUNT_EDITOR_NAME,
	ACCOUNT_EDITOR_NOTES,
	ACCOUNT_EDITOR_STARTING_BALANCE,
	ACCOUNT_EDITOR_TYPE,
	ACCOUNT_MODIFY_EDIT,
	ACCOUNT_MODIFY_NEW,
	ACCOUNT_TYPE,
	ACCOUNT_TYPE_EDITOR_ERROR_UPDATING_ACCOUNT_TYPE,
	ACTUAL,
	ACTUAL_VS_BUDGETED_EXPENSES_TITLE,
	ADVANCED,
	ALL,
	ALL_TRANSACTIONS,
	AMOUNT,
	AND_REPEATING_EVERY,
	AND_REPEATING_ON_THE,
	AUTO,
	AUTOSAVE_PERIOD,
	AVAILABLE_CREDIT,
	AVAILABLE_FUNDS,
	AVERAGE,
	BACKUP_LOCATION,
	BACKUP_LOCATION_HINT,
	BACKUP_MANAGER,
	BALANCES_LABEL,
	BALANCE_LABEL,
	BALANCE_OF_ACCOUNT,
	BALANCE_OF_TRANSACTIONS_CLEARED,
	BALANCE_OF_TRANSACTIONS_RECONCILED,
	BONUS,
	BUDDI,
	BUDGETED,
	BUDGETED_AMOUNT,
	BUDGET_CATEGORIES_COMBOBOX_HEADER,
	BUDGET_CATEGORY,
	BUDGET_EDITOR_BUDGET_PERIOD_TYPE,
	BUDGET_EDITOR_ERROR_UPDATING_CATEGORY,
	BUDGET_EDITOR_EXPENSE,
	BUDGET_EDITOR_INCOME,
	BUDGET_EDITOR_NAME,
	BUDGET_EDITOR_NOTES,
	BUDGET_EDITOR_PARENT,
	BUDGET_EDITOR_TYPE,
	BUDGET_INTERVAL,
	BUDGET_NET_INCOME,
	CANCELLED_FILE_LOAD,
	CANCELLED_FILE_LOAD_MESSAGE,
	CANCELLED_FILE_RESTORE,
	CANCEL_FILE_RESTORE_MESSAGE,
	CANNOT_PARSE_DATE,
	CASH,
	CATEGORY,
	CATEGORY_MODIFY_EDIT,
	CATEGORY_MODIFY_NEW,
	CHECK_CONSOLE,
	CHEQUING,
	CHOOSE_BACKUP_FILE,
	CHOOSE_DATE_INTERVAL,
	CHOOSE_EXPORT_FILE,
	CHOOSE_PLUGIN_JAR,
	CLEAR,
	CLEAR_TRANSACTION,
	CLEAR_TRANSACTION_LOSE_CHANGES,
	CLOSE_DATA_FILE,
	CONCISE_TRANSACTION_CELL_RENDERER,
	CONFIRM_LOAD_BACKUP_FILE,
	CONFIRM_RESTORE_BACKUP_FILE,
	CREATE_NEW_DATA_FILE,
	CREDIT,
	CREDIT_CARD,
	CREDIT_LIMIT,
	CURRENT_BUDGET_PERIOD,
	DATA_FILE_STATS,
	DATA_FILE_STATS_ACCOUNTS,
	DATA_FILE_STATS_BUDGET_CATEGORIES,
	DATA_FILE_STATS_SCHEDULED_TRANSACTIONS,
	DATA_FILE_STATS_TITLE,
	DATA_FILE_STATS_TRANSACTIONS,
	DATE,
	DAYS,
	DEBIT,
	DEBIT_CREDIT_TYPE,
	DEFAULT_SEARCH,
	DEFAULT_TRANSLATION_CELL_RENDERER,
	DEFAULT_TRANSLATION_CELL_RENDERER_WITH_CHEQUES,
	DELETE_CATEGORY,
	DELETE_TRANSACTION,
	DELETE_TRANSACTION_LOSE_CHANGES,
	DELETE_TRANSACTION_OR_VOID_TRANSACTION,
	DESCRIPTION,
	DIFFERENCE,
	DOCUMENTS,
	DUPLICATE_ACCOUNT_NAMES,
	DUPLICATE_BUDGET_CATEGORY_NAMES,
	EDIT_ACCOUNT_TYPES,
	EDIT_CATEGORY,
	ENCRYPT_DATA_FILE_TITLE,
	ENCRYPT_DATA_FILE_YES_NO,
	ENDING_ON,
	ENTERTAINMENT, 
	ENTER_ACCOUNT_NAME_AND_TYPE,
	ENTER_ACCOUNT_TYPE_NAME,
	ENTER_CATEGORY_NAME,
	ERROR,
	EXPENSES,
	EXPORT_TO_CSV,
	EXPORT_TO_HTML,
	FILECHOOSER_EXPORT_FILE_TITLE,
	FILECHOOSER_IMPORT_FILE_TITLE,
	FILECHOOSER_NEW_DATA_FILE_TITLE, 
	FILECHOOSER_OPEN_DATA_FILE_TITLE,
	FILECHOOSER_SAVE_DATA_FILE_TITLE,
	FILECHOOSER_SYNCHRONIZE_FILE_TITLE,
	FILE_DESCRIPTION_BUDDI_BACKUP,
	FILE_DESCRIPTION_BUDDI_DATA_FILES,
	FILE_DESCRIPTION_BUDDI_EXPORT_FILES,
	FILE_DESCRIPTION_BUDDI_IMPORT_FILES,
	FILE_DESCRIPTION_BUDDI_PLUGINS,
	FILE_DESCRIPTION_BUDDI_SYNCHRONIZE_FILES,
	FILE_SAVED,
	FILTERED_SUM_LABEL,
	GRAPHS,
	GRAPH_DESCRIPTION_EXPENSE_ACTUAL_BUDGET,
	GRAPH_DESCRIPTION_EXPENSE_PIE_GRAPH,
	GRAPH_DESCRIPTION_INCOME_PIE_GRAPH,
	GRAPH_DESCRIPTION_NET_WORTH_BREAKDOWN,
	GRAPH_TITLE_EXPENSE_ACTUAL_BUDGET,
	GRAPH_TITLE_EXPENSE_PIE_GRAPH,
	GRAPH_TITLE_INCOME_PIE_GRAPH,
	GRAPH_TITLE_NET_WORTH_BREAKDOWN,
	GRAPH_TITLE_NET_WORTH_OVER_TIME,
	GROCERIES,
	HINT_CONFIRM_PASSWORD,
	HINT_DESCRIPTION,
	HINT_FROM,
	HINT_MEMO,
	HINT_MESSAGE,
	HINT_NAME,
	HINT_NOTES,
	HINT_NUMBER,
	HINT_PASSWORD,
	HINT_PORT,
	HINT_PROXY_SERVER_NAME,
	HINT_SCHEDULED_TRANSACTION_NAME,
	HINT_SOURCE,
	HINT_TO,
	HOUSEHOLD,
	HTML_TO,
	INCOME,
	INCORRECT_PASSWORD,
	INCORRECT_PASSWORD_TITLE,
	INTEREST_RATE,
	INTERVAL_FORTNIGHT,
	INTERVAL_MONTH,
	INTERVAL_QUARTER,
	INTERVAL_WEEK,
	INTERVAL_YEAR,
	INVESTMENT,
	INVESTMENT_EXPENSES, 
	INVESTMENT_INCOME,
	JAR_FILES,
	LANGUAGE_EDITOR_BLANK_VALUE,
	LANGUAGE_EDITOR_HELP,
	LANGUAGE_EDITOR_LOCALE,
	LANGUAGE_EDITOR_NAME,
	LIABILITY,
	LICENCES,
	LINE_OF_CREDIT,
	LOAN,
	LOCALE,
	LOCALE_COUNTRY_CODE,
	LOCALE_LANGUAGE_CODE,
	MEMO,
	MESSAGE_ASK_FOR_DATA_FILE_ENCRYPTION,
	MESSAGE_ASK_FOR_DATA_FILE_ENCRYPTION_TITLE,
	MESSAGE_ASK_FOR_DONATION,
	MESSAGE_ASK_FOR_DONATION_TITLE,
	MESSAGE_AUTOSAVE_FILE_FOUND,
	MESSAGE_AUTOSAVE_FILE_FOUND_TITLE,
	MESSAGE_BACKUPS_ARE_IMPORTANT_TEXT,
	MESSAGE_CANNOT_DELETE_TYPE,
	MESSAGE_CHANGE_ENCRYPTION_TITLE,
	MESSAGE_CHANGE_EXISTING_TRANSACTION,
	MESSAGE_CHANGE_EXISTING_TRANSACTION_TITLE,
	MESSAGE_CHOOSE_NEW_OR_EXISTING_DATA_FILE,
	MESSAGE_CHOOSE_NEW_OR_EXISTING_DATA_FILE_TITLE,
	MESSAGE_CONCURRENT_SAVE_EXCEPTION_TEXT,
	MESSAGE_DECRYPT_DATA_FILE_WARNING,
	MESSAGE_EMPTY_PASSWORD,
	MESSAGE_EMPTY_PASSWORD_TITLE,
	MESSAGE_ENCRYPT_DATA_FILE_WARNING,
	MESSAGE_ENTER_PASSWORD,
	MESSAGE_ENTER_PASSWORD_TITLE,
	MESSAGE_ERROR_CANNOT_READ_DATA_FILE,
	MESSAGE_ERROR_CANNOT_WRITE_DATA_FILE,
	MESSAGE_ERROR_CANNOT_WRITE_OVER_FILE,
	MESSAGE_ERROR_CANNOT_WRITE_PREFS_FILE,
	MESSAGE_ERROR_CHECKING_FOR_UPDATES,
	MESSAGE_ERROR_CHECK_LOGS_FOR_DETAILS,
	MESSAGE_ERROR_COPYING_PLUGIN,
	MESSAGE_ERROR_COPYING_PLUGIN_TITLE,
	MESSAGE_ERROR_CREATING_FILE,
	MESSAGE_ERROR_DELETING_PLUGIN,
	MESSAGE_ERROR_DELETING_PLUGIN_POSTPONED,
	MESSAGE_ERROR_DELETING_PLUGIN_TITLE,
	MESSAGE_ERROR_NO_PASSWORD_ENTERED,
	MESSAGE_ERROR_OPENING_FILE,
	MESSAGE_ERROR_PASSWORDS_DONT_MATCH,
	MESSAGE_ERROR_READING_FILE,
	MESSAGE_ERROR_READING_FILE_NOT_EXIST,
	MESSAGE_ERROR_RESTORING_FILE,
	MESSAGE_ERROR_SAVING_FILE,
	MESSAGE_EXPORTING_FILE,
	MESSAGE_GENERATING_GRAPH,
	MESSAGE_GENERATING_REPORT,
	MESSAGE_IMPORTING_FILE,
	MESSAGE_LANGUAGE_ADDED_RESTART_NEEDED,
	MESSAGE_LANGUAGE_ADDED_RESTART_NEEDED_TITLE,
	MESSAGE_LOADING_DATA,
	MESSAGE_NO_NEW_VERSION,
	MESSAGE_NO_NEW_VERSION_TITLE,
	MESSAGE_PERMANENT_DELETE_ACCOUNT,
	MESSAGE_PERMANENT_DELETE_ACCOUNT_TITLE,
	MESSAGE_PERMANENT_DELETE_CATEGORY,
	MESSAGE_PERMANENT_DELETE_CATEGORY_TITLE,
	MESSAGE_PLUGIN_ADDED_RESTART_NEEDED,
	MESSAGE_PLUGIN_ADDED_RESTART_NEEDED_TITLE,
	MESSAGE_PREFERENCES_CHANGED_RESTART_NEEDED,
	MESSAGE_PREFERENCES_CHANGED_RESTART_NEEDED_TITLE,
	MESSAGE_PROMPT_FOR_SAVE,
	MESSAGE_PROMPT_FOR_SAVE_TITLE,
	MESSAGE_PROMPT_OVERWRITE_FILE,
	MESSAGE_PROMPT_OVERWRITE_FILE_TITLE,
	MESSAGE_READING_FILE,
	MESSAGE_RESTORE_FROM_BACKUP,
	MESSAGE_RESTORE_FROM_BACKUP_TITLE,
	MESSAGE_REVERT_TO_SAVED,
	MESSAGE_REVERT_TO_SAVED_TITLE,
	MESSAGE_SYNCHRONIZING_FILES,
	MESSAGE_UPGRADE_NOTICE,
	MESSAGE_UPGRADE_NOTICE_TITLE,
	MINUTE,
	MINUTES,
	MISC_EXPENSES,
	MISSING_DATA_FILE,
	MORE_INFO_NEEDED,
	MUST_SELECT_BUDDI_FILE,
	MY_ACCOUNTS,
	MY_BUDGET,
	MY_REPORTS,
	NAME,
	NAME_MUST_BE_UNIQUE,
	NETWORK,
	NETWORTH_LINE_GRAPH,
	NET_WORTH,
	NEW_CATEGORY,
	NEW_TRANSACTION,
	NEW_VERSION,
	NEW_VERSION_MESSAGE,
	NEW_VERSION_MESSAGE_2,
	NOTHING_TO_PRINT,
	NOT_CLEARED,
	NOT_RECONCILED,
	NO_PARENT,
	NO_PLUGINS_IN_JAR,
	NO_PLUGINS_IN_JAR_TITLE,
	NUMBER,
	NUMBER_OF_BACKUPS,
	OF_EACH_MONTH,
	ON_EACH_OF_THE_FOLLOWING_MONTHS,
	ON_EACH_OF_THE_FOLLOWING_WEEKS,
	OPEN,
	OPENED_FILE,
	OPEN_DATA_FILE_TITLE,
	OPTIONAL_TAG,
	OVERDRAFT_LIMIT,
	OVERWRITE_EXISTING_FILE,
	OVERWRITE_EXISTING_FILE_MESSAGE,
	PARENT_CATEGORY,
	PLUGINS,
	PREFERENCES,
	PREFERENCE_AUTO_COMPLETE_TRANSACTION_INFORMATION,
	PREFERENCE_CURRENCY,
	PREFERENCE_DATE_FORMAT,
	PREFERENCE_EDIT_LANGUAGES,
	PREFERENCE_ENABLE_UPDATE_NOTIFICATIONS,
	PREFERENCE_ENTER_CURRENCY_SYMBOL,
	PREFERENCE_ENTER_CURRENCY_SYMBOL_TITLE,
	PREFERENCE_ENTER_DATE_FORMAT,
	PREFERENCE_ENTER_DATE_FORMAT_TITLE,
	PREFERENCE_ERROR_INCORRECT_FORMAT,
	PREFERENCE_HIDE_NEGATIVE_SIGNS,
	PREFERENCE_LANGUAGE,
	PREFERENCE_PROMPT_FOR_DATA_FILE_AT_STARTUP,
	PREFERENCE_SEND_CRASH_REPORTS,
	PREFERENCE_SHOW_CLEAR,
	PREFERENCE_SHOW_CREDIT_LIMIT,
	PREFERENCE_SHOW_CURRENCY_SYMBOL_AFTER_AMOUNT,
	PREFERENCE_SHOW_CURRENT_BUDGET,
	PREFERENCE_SHOW_DELETED,
	PREFERENCE_SHOW_FLAT_ACCOUNTS,
	PREFERENCE_SHOW_FLAT_BUDGET,
	PREFERENCE_SHOW_FLAT_BUDGET_IN_SOURCE_COMBOBOX,
	PREFERENCE_SHOW_INTEREST_RATE,
	PREFERENCE_SHOW_OVERDRAFT_LIMIT,
	PREFERENCE_SHOW_RECONCILE,
	PREFERENCE_SHOW_TOOLTIPS,
	PREPAID_ACCOUNT,
	PRINT_ERROR,
	PROBLEM_READING_PREFS_FILE,
	PROXY_SERVER,
	RECORD_BUTTON_ERROR,
	REPEAT_THIS_ACTION,
	REPORTS,
	REPORTS_SELECT_DATE_RANGE,
	REPORT_AS_OF_DATE,
	REPORT_BETWEEN,
	REPORT_BY_CATEGORY_HEADER,
	REPORT_BY_DESCRIPTION_HEADER,
	REPORT_DATE_ERROR,
	REPORT_DESCRIPTION_ACCOUNT_BALANCE,
	REPORT_DESCRIPTION_AVERAGE_INCOME_AND_EXPENSES_BY_CATEGORY,
	REPORT_DESCRIPTION_INCOME_EXPENSES_BY_CATEGORY,
	REPORT_DESCRIPTION_INCOME_EXPENSES_BY_DESCRIPTION,
	REPORT_DESCRIPTION_TRANSACTIONS,
	REPORT_DESCRIPTION_TRANSACTIONS_NOT_CLEARED,
	REPORT_DESCRIPTION_TRANSACTIONS_NOT_RECONCILED,
	REPORT_DETAILS,
	REPORT_KEYS_TRANSACTIONS_AMOUNT,
	REPORT_KEYS_TRANSACTIONS_DATE,
	REPORT_KEYS_TRANSACTIONS_DESCRIPTION,
	REPORT_KEYS_TRANSACTIONS_FROM,
	REPORT_KEYS_TRANSACTIONS_MEMO,
	REPORT_KEYS_TRANSACTIONS_NUMBER,
	REPORT_KEYS_TRANSACTIONS_TO,
	REPORT_ERROR_ADVANCED_DISPLAY_NOT_ENABLED,
	REPORT_SUMMARY,
	REPORT_TITLE_ACCOUNT_BALANCE,
	REPORT_TITLE_AVERAGE_INCOME_AND_EXPENSES_BY_CATEGORY,
	REPORT_TITLE_INCOME_AND_EXPENSES_BY_CATEGORY,
	REPORT_TITLE_INCOME_AND_EXPENSES_BY_DESCRIPTION,
	REPORT_TITLE_TRANSACTIONS,
	REPORT_TRANSACTIONS_NOT_CLEARED,
	REPORT_TRANSACTIONS_NOT_RECONCILED,
	RESTORED_FILE,
	RESTORE_DATA_FILE,
	SALARY,
	SAVINGS,
	SCHEDULED_DUPLICATE_NAME,
	SCHEDULED_DUPLICATE_NAME_TITLE,
	SCHEDULED_MESSAGE,
	SCHEDULED_NOT_ENOUGH_INFO,
	SCHEDULED_NOT_ENOUGH_INFO_TITLE,
	SCHEDULED_TRANSACTION,
	SCHEDULED_TRANSACTION_OFFSET,
	SCHEDULED_TRANSACTION_NAME,
	SCHEDULED_UNHANDLED_EXCEPTION,
	SCHEDULED_UNHANDLED_EXCEPTION_TITLE,
	SECONDS,
	SHORT_CLEARED,
	SHORT_RECONCILED,
	SHOW_BUDGET_CATEGORIES_FOR_PERIOD,
	SIMPLE_TRANSLATION_CELL_RENDERER,
	SOURCE_TO_FROM,
	SPLIT,
	SPLITS, //Used to tell the user a transaction is split, at bottom of source combo box list.
	SPLIT_BUTTON, //Used to open the split diaLogger.getLogger().  Normal translation is '...'.
	SPLIT_EDITOR,
	SPLIT_TOTAL,
	SPLIT_TRANSACTION_DIFFERENCE,
	STARTING_BALANCE,
	STARTING_ON,
	START_DATE_AFTER_END_DATE,
	START_DATE_IN_THE_PAST,
	START_DATE_IN_THE_PAST_TITLE,
	SUCCESSFUL_BACKUP,
	SUCCESSFUL_EXPORT,
	SUCCESSFUL_OPEN_FILE,
	SUCCESSFUL_RESTORE_FILE,
	SUCCESSFUL_SAVE_FILE,
	SUM_LABEL,
	SUM_OF_TRANSACTIONS_CLEARED,
	SUM_OF_TRANSACTIONS_NOT_CLEARED,
	SUM_OF_TRANSACTIONS_NOT_RECONCILED,
	SUM_OF_TRANSACTIONS_RECONCILED,
	TO,
	TOOLTIP_AMOUNT,
	TOOLTIP_AVAILABLE_FUNDS,
	TOOLTIP_CLEARED,
	TOOLTIP_DATE, 
	TOOLTIP_DESC,
	TOOLTIP_DISABLED_FOR_SPLIT,
	TOOLTIP_FROM,
	TOOLTIP_MEMO,
	TOOLTIP_NUMBER,
	TOOLTIP_RECONCILED,
	TOOLTIP_SCHEDULED_MESSAGE,
	TOOLTIP_SHOW_ACCOUNT_TYPES,
	TOOLTIP_SHOW_CLEAR,
	TOOLTIP_SHOW_CREDIT_LIMIT,
	TOOLTIP_SHOW_INTEREST_RATE,
	TOOLTIP_SHOW_RECONCILE,
	TOOLTIP_TO,
	TOTAL,
	TRANSACTIONS,
	TRANSACTION_AMOUNT,
	TRANSACTION_CELL_RENDERER,
	TRANSACTION_CHANGED_INVALID_MESSAGE,
	TRANSACTION_CHANGED_MESSAGE,
	TRANSACTION_CHANGED_TITLE,
	TRANSACTION_FILTER,
	TRANSACTION_FILTER_NOT_CLEARED,
	TRANSACTION_FILTER_NOT_RECONCILED,
	TYPE_MODIFY_EDIT,
	TYPE_MODIFY_NEW,
	USE_PROXY_SERVER,
	UTILITIES,
	VIEW,
	VOID_TRANSACTION,
	WARNING,
}
