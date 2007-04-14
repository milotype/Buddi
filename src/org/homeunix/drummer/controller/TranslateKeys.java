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
    ABOUT_TEXT,
    ABOUT_VERSION,
    ACCOUNT,
    ACCOUNT_AND_CATEGORY_SUMMARY,
    ACCOUNT_MODIFY_EDIT,
    ACCOUNT_MODIFY_NEW,
    ACCOUNT_TYPE,
    ACTUAL,
    ACTUAL_VS_BUDGETED_EXPENSES_TITLE,
    ADVANCED,
    ALL,
    AMOUNT,
    AND_REPEATING_EVERY,
    AND_REPEATING_ON_THE,
    AUTO,
    AUTO_COMPLETE_TRANSACTION_INFORMATION,
    AVAILABLE_CREDIT,
    AVAILABLE_OVERDRAFT,
    AVERAGE,
    BONUS,
    BUDDI,
    BUDGETED,
    BUDGETED_AMOUNT,
    BUDGET_INTERVAL,
    BUDGET_NET_INCOME,
    BUTTON_ADD,
    BUTTON_CANCEL,
    BUTTON_DELETE,
    BUTTON_DONATE,
    BUTTON_DONE,
    BUTTON_DOWNLOAD,
    BUTTON_EDIT,
    BUTTON_NEW,
    BUTTON_NEW_DATA_FILE,
    BUTTON_NO,
    BUTTON_NOT_NOW,
    BUTTON_OK,
    BUTTON_OPEN_DATA_FILE,
    BUTTON_OTHER,
    BUTTON_RECORD,
    BUTTON_REMOVE,
    BUTTON_UNDELETE,
    BUTTON_UPDATE,
    BUTTON_YES,
    CANCELLED_FILE_LOAD,
    CANCELLED_FILE_LOAD_MESSAGE,
    CANCELLED_FILE_RESTORE,
    CANCEL_FILE_RESTORE_MESSAGE,
    CASH,
    CATEGORY,
    CATEGORY_MODIFY_EDIT,
    CATEGORY_MODIFY_NEW,
    CHANGE_ENCRYPTION,
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
    CONFIRM_LOAD_BACKUP_FILE,
    CONFIRM_PASSWORD,
    CONFIRM_RESTORE_BACKUP_FILE,
    CREATE_NEW_DATA_FILE,
    CREDIT,
    CREDIT_CARD,
    CREDIT_LIMIT,
    CURRENCY,
    DATE,
    DATE_FORMAT,
    DECRYPT_DATA_FILE_WARNING,
    DEFAULT_SEARCH,
    DELETE_CATEGORY,
    DELETE_TRANSACTION,
    DELETE_TRANSACTION_LOSE_CHANGES,
    DESCRIPTION,
    DIFFERENCE,
    DOCUMENTS,
    EDIT_ACCOUNT_TYPES,
    EDIT_CATEGORY,
    EDIT_LANGUAGES,
    EMPTY_PASSWORD,
    EMPTY_PASSWORD_TITLE,
    ENABLE_UPDATE_NOTIFICATIONS,
    ENCRYPT_DATA_FILE_TITLE,
    ENCRYPT_DATA_FILE_WARNING,
    ENCRYPT_DATA_FILE_YES_NO,
    ENTERTAINMENT, 
    ENTER_ACCOUNT_NAME_AND_TYPE,
    ENTER_ACCOUNT_TYPE_NAME,
    ENTER_CATEGORY_NAME,
    ENTER_CURRENCY_SYMBOL,
    ENTER_CURRENCY_SYMBOL_TITLE,
    ENTER_PASSWORD,
    ENTER_PASSWORD_TITLE,
    ERROR,
    EXITING_PROGRAM,
    EXPENSES,
    EXPORT_TO_CSV,
    EXPORT_TO_HTML,
    FILECHOOSER_NEW_DATA_FILE_TITLE, 
    FILECHOOSER_OPEN_DATA_FILE_TITLE,
    FILECHOOSER_SAVE_DATA_FILE_TITLE,
    FILE_DESCRIPTION_BUDDI,
    FILE_DESCRIPTION_BUDDI_BACKUP,
    FILE_SAVED,
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
    HINT_DESCRIPTION,
    HINT_MEMO,
    HINT_MESSAGE,
    HINT_NUMBER,
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
    LANGUAGE,
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
    MENU_EDIT,
    MENU_EDIT_CLEAR_NEW,
    MENU_EDIT_PREFERENCES,
    MENU_EDIT_RECORD_UPDATE,
    MENU_EDIT_SCHEDULED_ACTIONS,
    MENU_EDIT_TOGGLE_CLEARED,
    MENU_EDIT_TOGGLE_RECONCILED,
    MENU_FILE,
    MENU_FILE_BACKUP,
    MENU_FILE_CLOSE_WINDOW,
    MENU_FILE_DECRYPT,
    MENU_FILE_ENCRYPT,
    MENU_FILE_EXPORT,
    MENU_FILE_IMPORT,
    MENU_FILE_NEW,
    MENU_FILE_OPEN,
    MENU_FILE_PRINT,
    MENU_FILE_QUIT,
    MENU_FILE_RESTORE,
    MENU_FILE_SAVE_AS,
    MENU_HELP,
    MENU_HELP_ABOUT,
    MENU_HELP_HELP,
    MENU_WINDOW,
    MENU_WINDOW_MAIN_WINDOW,
    MENU_WINDOW_MINIMIZE,
    MESSAGE_ASK_FOR_DONATION,
    MESSAGE_ASK_FOR_DONATION_TITLE,
    MESSAGE_CANNOT_DELETE_TYPE,
    MESSAGE_CHOOSE_NEW_OR_EXISTING_DATA_FILE,
    MESSAGE_CHOOSE_NEW_OR_EXISTING_DATA_FILE_TITLE,
    MESSAGE_ENTER_DATE_FORMAT,
    MESSAGE_ENTER_DATE_FORMAT_TITLE,
    MESSAGE_ERROR_CANNOT_READ_DATA_FILE,
    MESSAGE_ERROR_CANNOT_WRITE_DATA_FILE,
    MESSAGE_ERROR_CANNOT_WRITE_OVER_FILE,
    MESSAGE_ERROR_CANNOT_WRITE_PREFS_FILE,
    MESSAGE_ERROR_INCORRECT_FORMAT,
    MESSAGE_ERROR_PASSWORDS_DONT_MATCH,
    MESSAGE_ERROR_READING_FILE,
    MESSAGE_ERROR_READING_FILE_NOT_EXIST,
    MESSAGE_ERROR_SAVING_FILE,
    MESSAGE_PERMANENT_DELETE_ACCOUNT,
    MESSAGE_PERMANENT_DELETE_ACCOUNT_TITLE,
    MESSAGE_PERMANENT_DELETE_CATEGORY,
    MESSAGE_PERMANENT_DELETE_CATEGORY_TITLE,
    MESSAGE_UPGRADE_NOTICE,
    MESSAGE_UPGRADE_NOTICE_TITLE,
    MISC_EXPENSES,
    MISSING_DATA_FILE,
    MORE_INFO_NEEDED,
    MUST_SELECT_BUDDI_FILE,
    MY_ACCOUNTS,
    MY_BUDGET,
    NAME,
    NAME_MUST_BE_UNIQUE,
    NETWORTH_LINE_GRAPH,
    NET_WORTH,
    NEW_CATEGORY,
    NEW_DATA_FILE_SAVED,
    NEW_TRANSACTION,
    NEW_VERSION,
    NEW_VERSION_MESSAGE,
    NEW_VERSION_MESSAGE_2,
    NOTHING_TO_PRINT,
    NOT_CLEARED,
    NOT_RECONCILED,
    NO_PARENT,
    NO_PASSWORD_ENTERED,
    NO_PLUGINS_IN_JAR,
    NO_PLUGINS_IN_JAR_TITLE,
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
    PASSWORD,
    PLUGINS,
    PLUGIN_FILTER_LAST_MONTH,
    PLUGIN_FILTER_LAST_QUARTER,
    PLUGIN_FILTER_LAST_WEEK,
    PLUGIN_FILTER_LAST_YEAR,
    PLUGIN_FILTER_ONE_MONTH,
    PLUGIN_FILTER_OTHER,
    PLUGIN_FILTER_PAST_FORTNIGHT,
    PLUGIN_FILTER_PAST_WEEK,
    PLUGIN_FILTER_SIX_MONTHS,
    PLUGIN_FILTER_THIS_MONTH,
    PLUGIN_FILTER_THIS_QUARTER,
    PLUGIN_FILTER_THIS_YEAR,
    PLUGIN_FILTER_TODAY,
    PLUGIN_FILTER_TWO_MONTHS,
    PLUGIN_FILTER_YEAR,
    PLUGIN_FILTER_YESTERDAY,
    PREFERENCES,
    PREPAID_ACCOUNT,
    PRINT_ERROR,
    PROBLEM_READING_PREFS_FILE,
    PROMPT_FOR_DATA_FILE_AT_STARTUP,
    RECORD_BUTTON_ERROR,
    REPEAT_THIS_ACTION,
    REPORTS,
    REPORT_AS_OF_DATE,
    REPORT_BETWEEN,
    REPORT_BY_CATEGORY_HEADER,
    REPORT_BY_DESCRIPTION_HEADER,
    REPORT_DATE_ERROR,
    REPORT_DESCRIPTION_AVERAGE_INCOME_AND_EXPENSES_BY_CATEGORY,
    REPORT_DESCRIPTION_INCOME_EXPENSES_BY_CATEGORY,
    REPORT_DESCRIPTION_INCOME_EXPENSES_BY_DESCRIPTION,
    REPORT_DESCRIPTION_TRANSACTIONS_NOT_CLEARED,
    REPORT_DESCRIPTION_TRANSACTIONS_NOT_RECONCILED,
    REPORT_DETAILS,
    REPORT_ERROR_ADVANCED_DISPLAY_NOT_ENABLED,
    REPORT_SUMMARY,
    REPORT_TITLE_AVERAGE_INCOME_AND_EXPENSES_BY_CATEGORY,
    REPORT_TITLE_INCOME_AND_EXPENSES_BY_CATEGORY,
    REPORT_TITLE_INCOME_AND_EXPENSES_BY_DESCRIPTION,
    REPORT_TITLE_TRANSACTIONS_NOT_CLEARED,
    REPORT_TITLE_TRANSACTIONS_NOT_RECONCILED,
    REPORT_TRANSACTIONS_NOT_CLEARED,
    REPORT_TRANSACTIONS_NOT_RECONCILED,
    RESTART_NEEDED,
    RESTART_NEEDED_TITLE,
    RESTORED_FILE,
    RESTORE_DATA_FILE,
    SALARY,
    SAVINGS, 
    SCHEDULED_ACTION,
    SCHEDULED_ACTIONS,
    SCHEDULED_ACTION_NAME,
    SCHEDULED_MESSAGE,
    SCHEDULED_NOT_ENOUGH_INFO,
    SCHEDULED_NOT_ENOUGH_INFO_TITLE,
    SCHEDULE_DATE_EIGHTEENTH,
    SCHEDULE_DATE_EIGHTH,
    SCHEDULE_DATE_ELEVENTH,
    SCHEDULE_DATE_FIFTEENTH,
    SCHEDULE_DATE_FIFTH,
    SCHEDULE_DATE_FIRST,
    SCHEDULE_DATE_FOURTEENTH,
    SCHEDULE_DATE_FOURTH,
    SCHEDULE_DATE_NINETEENTH,
    SCHEDULE_DATE_NINETH,
    SCHEDULE_DATE_SECOND,
    SCHEDULE_DATE_SEVENTEENTH,
    SCHEDULE_DATE_SEVENTH,
    SCHEDULE_DATE_SIXTEENTH,
    SCHEDULE_DATE_SIXTH,
    SCHEDULE_DATE_TENTH,
    SCHEDULE_DATE_THIRD,
    SCHEDULE_DATE_THIRTEENTH,
    SCHEDULE_DATE_THIRTIETH,
    SCHEDULE_DATE_THIRTYFIRST,
    SCHEDULE_DATE_TWELFTH,
    SCHEDULE_DATE_TWENTIETH,
    SCHEDULE_DATE_TWENTYEIGHTH,
    SCHEDULE_DATE_TWENTYFIFTH,
    SCHEDULE_DATE_TWENTYFIRST,
    SCHEDULE_DATE_TWENTYFOURTH,
    SCHEDULE_DATE_TWENTYNINETH,
    SCHEDULE_DATE_TWENTYSECOND,
    SCHEDULE_DATE_TWENTYSEVENTH,
    SCHEDULE_DATE_TWENTYSIXTH,
    SCHEDULE_DATE_TWENTYTHIRD,
    SCHEDULE_DAY_FIRST_FRIDAY,
    SCHEDULE_DAY_FIRST_MONDAY,
    SCHEDULE_DAY_FIRST_SATURDAY,
    SCHEDULE_DAY_FIRST_SUNDAY,
    SCHEDULE_DAY_FIRST_THURSDAY,
    SCHEDULE_DAY_FIRST_TUESDAY,
    SCHEDULE_DAY_FIRST_WEDNESDAY,
    SCHEDULE_DAY_FRIDAY,
    SCHEDULE_DAY_MONDAY,
    SCHEDULE_DAY_SATURDAY,
    SCHEDULE_DAY_SUNDAY,
    SCHEDULE_DAY_THURSDAY,
    SCHEDULE_DAY_TUESDAY,
    SCHEDULE_DAY_WEDNESDAY,
    SCHEDULE_FREQUENCY_BIWEEKLY,
    SCHEDULE_FREQUENCY_EVERY_DAY,
    SCHEDULE_FREQUENCY_EVERY_WEEKDAY,//added by  Nicky
    SCHEDULE_FREQUENCY_MONTHLY_BY_DATE,
    SCHEDULE_FREQUENCY_MONTHLY_BY_DAY_OF_WEEK,
    SCHEDULE_FREQUENCY_MULTIPLE_MONTHS_EVERY_YEAR,
    SCHEDULE_FREQUENCY_MULTIPLE_WEEKS_EVERY_MONTH,
    SCHEDULE_FREQUENCY_WEEKLY,
    SCHEDULE_MONTH_APRIL,
    SCHEDULE_MONTH_AUGUST,
    SCHEDULE_MONTH_DECEMBER,
    SCHEDULE_MONTH_FEBRUARY,
    SCHEDULE_MONTH_JANUARY,
    SCHEDULE_MONTH_JULY,
    SCHEDULE_MONTH_JUNE,
    SCHEDULE_MONTH_MARCH,
    SCHEDULE_MONTH_MAY,
    SCHEDULE_MONTH_NOVEMEBER,
    SCHEDULE_MONTH_OCTOBER,
    SCHEDULE_MONTH_SEPTEMBER,
    SCHEDULE_WEEK_FIRST,
    SCHEDULE_WEEK_FOURTH,
    SCHEDULE_WEEK_SECOND,
    SCHEDULE_WEEK_THIRD,
    SHORT_CLEARED,
    SHORT_RECONCILED,
    SHOW_ACCOUNT_TYPES,
    SHOW_CLEAR_RECONCILE,
    SHOW_CREDIT_LIMIT,
    SHOW_CURRENCY_SYMBOL_AFTER_AMOUNT,
    SHOW_DELETED_ACCOUNTS,
    SHOW_DELETED_CATEGORIES,
    SHOW_INTEREST_RATE,
    SOURCE_TO_FROM,
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
    TO,
    TOOLTIP_AMOUNT,
    TOOLTIP_DATE, 
    TOOLTIP_DESC,
    TOOLTIP_FROM,
    TOOLTIP_MEMO,
    TOOLTIP_NUMBER,
    TOOLTIP_SCHEDULED_MESSAGE,
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
    TRANSACTION_FILTER,
    TRANSACTION_FILTER_ALL,
    TRANSACTION_FILTER_LAST_YEAR,
    TRANSACTION_FILTER_NOT_CLEARED,
    TRANSACTION_FILTER_NOT_RECONCILED,
    TRANSACTION_FILTER_THIS_MONTH,
    TRANSACTION_FILTER_THIS_QUARTER,
    TRANSACTION_FILTER_THIS_WEEK,
    TRANSACTION_FILTER_THIS_YEAR,
    TRANSACTION_FILTER_TODAY,
    TYPE_MODIFY_EDIT,
    TYPE_MODIFY_NEW,
    UTILITIES,
    VIEW, 
}
