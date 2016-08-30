package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;

import java.util.List;

/**
 * Format UI of the application.
 */
public class Formatter {
    
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    public static final String LINE_PREFIX = "|| ";
    
    /** A decorative prefix added to the beginning of command echo printed by AddressBook */
    public static final String ECHO_PREFIX = "[";
    /** A decorative suffix added to the beginning of command echo printed by AddressBook */
    public static final String ECHO_SUFFIX = "]";

    /** A platform independent line separator. */
    public static final String LS = System.lineSeparator();

    public static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    public static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;
    
    /** Prompt for user command. */
    public static final String USER_COMMAND_PROMPT = "Enter command: ";
    /** Echo user command. */
    public static final String USER_COMMAND_ECHO = "Command entered:";

    public static String formatUserPrompt() {
        return LINE_PREFIX + USER_COMMAND_PROMPT;
    }
    
    public static String formatEchoResponse(String command) {
        return formatMessageBlock(ECHO_PREFIX + USER_COMMAND_ECHO + command + ECHO_SUFFIX);
    }
    
    public static String formatWelcomeMessage(String version, String storageFileInfo) {
        return formatMessageBlock(DIVIDER, DIVIDER, MESSAGE_WELCOME, 
                                  version, MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE, 
                                  storageFileInfo, DIVIDER);
    }
    
    public static String formatGoodbyeMessage() {
        return formatMessageBlock(MESSAGE_GOODBYE, DIVIDER, DIVIDER);
    }
    
    public static String formatInitFailedMessage() {
        return formatMessageBlock(MESSAGE_INIT_FAILED, DIVIDER, DIVIDER);
    }
    
    public static String formatCommandResult(String result) {
        return formatMessageBlock(result, DIVIDER);
    }
    
    /** Formats a block of message to user */
    public static String formatMessageBlock(String... message) {
        String messageBlock = "";
        for (String m : message) {
            messageBlock += LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX) + "\n";
        }
        return messageBlock;
    }
    
    /** Formats a list of strings as a viewable indexed list. */
    public static String formatIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(formatIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatMessageBlock(formatted.toString());
    }

    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    public static String formatIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }
}
