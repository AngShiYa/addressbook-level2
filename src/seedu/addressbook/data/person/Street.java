package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's street in the address.
 */
public class Street {

    public static final String STREET_EXAMPLE = "Clementi Ave 4 ";
    public static final String MESSAGE_STREET_CONSTRAINTS =  
            "Person street should only contains alphanumeric and space";
    public static final String STREET_VALIDATION_REGEX = "[\\p{Alnum} ]+";
    
    private String street;
    
    public Street(String street) throws IllegalValueException {
        if (!isStreetValid(street)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.street = street;
    }
    
    public String getStreet() {
        return this.street;
    }
    
    /**
     * Returns true if a given string is a valid person street.
     */
    public static boolean isStreetValid(String street) {
        return street.matches(STREET_VALIDATION_REGEX);
    }
}
