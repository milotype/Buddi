/*
 * Created on Jun 2, 2006 by wyatt
 */
package org.homeunix.drummer.controller;

/**
 * I use this list of keys for the Translate class.  Using this instead 
 * of string constants gives me more flexibility and less ugly code
 * that I have to wade through. 
 * @author wyatt
 *
 */
public enum TranslateKeys {

    ABOUT_COPYRIGHT,
    ABOUT_EMAIL,
    ABOUT_GPL,
    ABOUT_MENU_ITEM,
    ABOUT_TEXT,
    ACCOUNT,
    ACCOUNT_TYPE,
    ACTUAL,
    ADD,
    ADVANCED,
    ALL,
    AMOUNT,
    AND,
    AUTO,
    AUTO_COMPLETE_TRANSACTION_INFORMATION,
    AVAILABLE_CREDIT,
    AVAILABLE_OVERDRAFT,
    BACKUP_DATA_FILE, 
    BONUS,
    BUDDI,
    BUDDI_FILE_DESC,
    BUDDI_HELP,
    BUDGETED,
    BUDGETED_AMOUNT,
    BUDGET_INTERVAL,
    BUDGET_NET_INCOME,
    CANCEL,
    CANCELLED_FILE_LOAD,
    CANCELLED_FILE_LOAD_MESSAGE,
    CANCELLED_FILE_RESTORE,
    CANCEL_FILE_RESTORE_MESSAGE,
    CANNOT_READ_FILE,
    CANNOT_SAVE_OVER_DIR,
    CASH,
    CATEGORY,
    CHANGE_ENCRYPTION,
    CHEQUING,
    CHOOSE_BACKUP_FILE,
    CHOOSE_DATASTORE_LOCATION,
    CHOOSE_DATA_DIR,
    CHOOSE_DATE_INTERVAL,
    CHOOSE_EXPORT_FILE,
    CHOOSE_PLUGIN_JAR,
    CLEAR,
    CLEARED_SHORT,
    CLEAR_TRANSACTION,
    CLEAR_TRANSACTION_LOSE_CHANGES,
    CLOSE_DATA_FILE,
    CLOSE_WINDOW,
    CONFIRM_LOAD_BACKUP_FILE,
    CONFIRM_PASSWORD,
    CONFIRM_RESTORE_BACKUP_FILE,
    COPY,
    CREATED_NEW_DATA_FILE,
    CREATED_NEW_DATA_FILE_MESSAGE,
    CREATE_NEW_DATA_FILE,
    CREDIT_CARD,
    CREDIT_LIMIT,
    CURRENCY,
    CUT,
    DATE_AFTER_TODAY,
    DATE_FILTER,
    DATE_FORMAT,
    DECRYPT_DATA_FILE,
    DECRYPT_DATA_FILE_WARNING,
    DEFAULT_DESCRIPTION,
    DEFAULT_MEMO,
    DEFAULT_NUMBER,
    DEFAULT_SEARCH,
    DELETE,
    DELETE_TRANSACTION,
    DELETE_TRANSACTION_LOSE_CHANGES,
    DESCRIPTION,
    DESTINATION,
    DIFFERENCE,
    DONATE,
    DONATE_HEADER,
    DONATE_MESSAGE,
    DONE,
    DOWNLOAD,
    EDIT,
    EDIT_LANGUAGES,
    EDIT_SCHEDULED_TRANSACTIONS,
    EMPTY_PASSWORD,
    EMPTY_PASSWORD_TITLE,
    ENABLE_UPDATE_NOTIFICATIONS,
    ENCRYPT_DATA_FILE,
    ENCRYPT_DATA_FILE_TITLE,
    ENCRYPT_DATA_FILE_WARNING,
    ENCRYPT_DATA_FILE_YES_NO,
    ENTERTAINMENT, 
    ENTER_ACCOUNT_NAME_AND_TYPE,
    ENTER_CATEGORY_NAME,
    ENTER_PASSWORD,
    ENTER_PASSWORD_TITLE,
    ERROR,
    EVERY,
    EXITING_PROGRAM,
    EXPENSES,
    EXPENSE_ACTUAL_BUDGET,
    EXPENSE_ACTUAL_BUDGET_BAR_GRAPH,
    EXPENSE_PIE_GRAPH,
    EXPORT,
    EXPORT_PLUGINS,
    EXPORT_TO_CSV,
    EXPORT_TO_HTML,
    FILE,
    FILE_SAVED,
    FORTNIGHT,
    FREQUENCY,
    FRIDAY,
    GO,
    GROCERIES,
    HELP,
    HOUSEHOLD,
    IMPORT,
    IMPORT_PLUGINS,
    INCOME,
    INCOME_PIE_GRAPH,
    INCORRECT_PASSWORD,
    INCORRECT_PASSWORD_TITLE,
    INTEREST_RATE,
    INVESTMENT,
    INVESTMENT_EXPENSES, 
    INVESTMENT_INCOME,
    JAR_FILES,
    LANGUAGE,
    LANGUAGE_EDITOR_BLANK_VALUE,
    LANGUAGE_EDITOR_HELP,
    LANGUAGE_EDITOR_LOCALE,
    LANGUAGE_EDITOR_NAME,
    LAST_MONTH,
    LAST_QUARTER,
    LAST_WEEK,
    LAST_YEAR,
    LIABILITY,
    LINE_OF_CREDIT,
    LOAD_BACKUP_FILE,
    LOAN,
    LOCALE,
    MINIMIZE,
    MISC_EXPENSES,
    MISSING_DATA_FILE,
    MONDAY,
    MONTH,
    MORE_INFO_NEEDED,
    MUST_SELECT_BUDDI_FILE,
    MY_ACCOUNTS,
    MY_BUDGET,
    NAME,
    NETWORTH_LINE_GRAPH,
    NETWORTH_PIE_GRAPH,
    NET_WORTH,
    NEW,
    NEW_DATA_FILE, 
    NEW_DATA_FILE_SAVED,
    NEW_TRANSACTION,
    NEW_VERSION,
    NEW_VERSION_MESSAGE,
    NEW_VERSION_MESSAGE_2,
    NOTHING_TO_PRINT,
    NOT_NOW,
    NO_DATA_DIR,
    NO_PARENT,
    NO_PASSWORD_ENTERED,
    NO_PASSWORD_ENTERED_TITLE,
    NO_PLUGINS_IN_JAR,
    NO_PLUGINS_IN_JAR_TITLE,
    NO_TRANSACTIONS_USING_ACCOUNT,
    NO_TRANSACTIONS_USING_CATEGORY,
    NUMBER_OF_BACKUPS,
    OK,
    ONE_MONTH,
    OPEN,
    OPENED_FILE,
    OPEN_DATA_FILE,
    OPEN_DATA_FILE_TITLE,
    OPTIONAL_TAG,
    OTHER,
    OVERDRAFT_LIMIT,
    OVERWRITE_EXISTING_FILE,
    OVERWRITE_EXISTING_FILE_MESSAGE,
    PANEL_PLUGINS,
    PARENT_CATEGORY,
    PASSWORD,
    PASSWORDS_DONT_MATCH,
    PASTE,
    PAST_FORTNIGHT,
    PAST_WEEK,
    PERMANENT_DELETE_ACCOUNT,
    PERMANENT_DELETE_CATEGORY,
    PLUGINS,
    PLUGIN_ENTRY,
    PLUGIN_ENTRY_TITLE,
    PREFERENCES,
    PREFERENCES_MENU_ITEM,
    PREPAID_ACCOUNT,
    PRINT,
    PRINT_ERROR,
    PROBLEM_READING_DATA_FILE_CORRUPTED,
    PROBLEM_READING_DATA_FILE_DIR_NOT_EXIST,
    PROBLEM_READING_DATA_FILE_INTRO,
    QUARTER,
    QUIT_MENU_ITEM,
    RECONCILED_SHORT,
    RECORD,
    RECORD_BUTTON_ERROR,
    REMOVE,
    REPORTS,
    REPORT_AS_OF_DATE,
    REPORT_BETWEEN,
    REPORT_BY_CATEGORY_HEADER,
    REPORT_BY_DESCRIPTION_HEADER,
    REPORT_DATE_ERROR,
    REPORT_INCOME_EXPENSES_BY_CATEGORY,
    REPORT_INCOME_EXPENSES_BY_DESCRIPTION,
    REPORT_INCOME_EXPENSES_DIFFERENCE,
    RESTART_NEEDED,
    RESTART_NEEDED_TITLE,
    RESTORED_FILE,
    RESTORE_DATA_FILE,
    SALARY,
    SATURDAY,
    SAVINGS, 
    SCHEDULED_NOT_ENOUGH_INFO,
    SCHEDULED_NOT_ENOUGH_INFO_TITLE,
    SCHEDULED_TRANSACTION,
    SCHEDULED_TRANSACTIONS,
    SHOW_ACCOUNT_TYPES,
    SHOW_CLEAR_RECONCILE,
    SHOW_CREDIT_LIMIT,
    SHOW_DELETED_ACCOUNTS,
    SHOW_DELETED_CATEGORIES,
    SHOW_INTEREST_RATE,
    SIX_MONTHS,
    SOURCE,
    STARTING_BALANCE,
    START_DATE,
    START_DATE_AFTER_END_DATE,
    START_DATE_IN_THE_PAST,
    START_DATE_IN_THE_PAST_TITLE,
    SUCCESSFUL_BACKUP,
    SUCCESSFUL_EXPORT,
    SUCCESSFUL_OPEN_FILE,
    SUCCESSFUL_RESTORE_FILE,
    SUNDAY,
    THIS_MONTH,
    THIS_QUARTER,
    THIS_WEEK,
    THIS_YEAR,
    THURSDAY,
    TO,
    TODAY,
    TOGGLE_CLEARED,
    TOGGLE_RECONCILED,
    TOOLTIP_AMOUNT,
    TOOLTIP_DATE, 
    TOOLTIP_DESC,
    TOOLTIP_FROM,
    TOOLTIP_MEMO,
    TOOLTIP_NUMBER,
    TOOLTIP_SHOW_ACCOUNT_TYPES,
    TOOLTIP_SHOW_CLEAR_RECONCILE,
    TOOLTIP_SHOW_CREDIT_LIMIT,
    TOOLTIP_SHOW_INTEREST_RATE,
    TOOLTIP_TO,
    TOTAL,
    TRANSACTIONS,
    TRANSACTION_CHANGED_INVALID_MESSAGE,
    TRANSACTION_CHANGED_MESSAGE,
    TRANSACTION_CHANGED_TITLE,
    TUESDAY,
    TWO_MONTHS,
    UNDELETE,
    UPDATE,
    UPGRADE_NOTICE,
    UPGRADE_NOTICE_TITLE,
    UTILITIES,
    VERSION,
    VIEW,
    WARNING,
    WEDNESDAY,
    WEEK,
    WINDOW,
    YEAR,
    YESTERDAY,
    ZOOM
    
}
