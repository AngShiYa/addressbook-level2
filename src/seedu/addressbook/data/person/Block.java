package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's block in the address.
 */
public class Block {
    
    public static final String BLOCK_EXAMPLE = "123c";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = 
            "Person block should be either number only or number followed by an alphabet";
    public static final String BLOCK_VALIDATION_REGEX = "[\\d]*[\\w]?";
    
    private String block;
    
    public Block(String block) throws IllegalValueException {
        if (!isBlockValid(block)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        this.block = block;
    }
    
    public String getBlock() {
        return this.block;
    }
    
    /**
     * Returns true if a given string is a valid person block.
     */
    public static boolean isBlockValid(String block) {
        return block.matches(BLOCK_VALIDATION_REGEX);
    }

}
