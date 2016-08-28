package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's postal code in the address.
 */
public class PostalCode {
    
    public static final String POSTALCODE_EXAMPLE = "670345";
    public static final String MESSAGE_POSTALCODE_CONSTRAINTS = "Person postal code should only contain numbers";
    public static final String POSTALCODE_VALIDATION_REGEX = "\\d+";
    
    private String postalCode;
    
    public PostalCode(String postalCode) throws IllegalValueException {
        if (!isPostalCodeValid(postalCode)) {
            throw new IllegalValueException(MESSAGE_POSTALCODE_CONSTRAINTS);
        }
        this.postalCode = postalCode;
    }
    
    public String getPostalCode() {
        return this.postalCode;
    }
    
    /**
     * Returns true if a given string is a valid person postal code.
     */
    public static boolean isPostalCodeValid(String postalCode) {
        return postalCode.matches(POSTALCODE_VALIDATION_REGEX);
    }

}
