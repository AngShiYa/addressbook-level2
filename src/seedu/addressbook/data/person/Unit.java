package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's unit in the address.
 */
public class Unit { 
    
    public static final String UNIT_EXAMPLE = "#06-12 ";
    public static final String MESSAGE_UNIT_CONSTRAINTS =  
            "Person unit should be in the format #number-number";
    public static final String UNIT_VALIDATION_REGEX = "#[\\d]+-[\\d]+";
    
    private String unit;
    
    public Unit(String unit) throws IllegalValueException {
        if (!isUnitValid(unit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.unit = unit;
    }
    
    public String getUnit() {
        return this.unit;
    }
    
    /**
     * Returns true if a given string is a valid person unit.
     */
    public static boolean isUnitValid(String unit) {
        return unit.matches(UNIT_VALIDATION_REGEX);
    }
}
