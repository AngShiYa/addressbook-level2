package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {
    
    public ArrayList<Integer> list;
    
    @Before
    public void setup() {
        list = new ArrayList<Integer>();
    }
    
    @Test
    public void isAnyNull_OneNullShouldReturnTrue() {
        Object obj = null;
        assertTrue("One null must return true", Utils.isAnyNull(obj));
    }
    
    @Test
    public void isAnyNull_BothNullAndNotNullShouldReturnTrue() {
        assertTrue("Both null and not null must return true", Utils.isAnyNull("Hello", null, "World"));
    }
    
    @Test
    public void isAnyNull_NoNullShouldReturnFalse() {
        assertFalse("No null must return false", Utils.isAnyNull("There", "is", "no", "null"));
    }
    
    @Test
    public void elementsAreUnique_NoElementShouldReturnTrue() {
        assertTrue("Collection with no elements must return true", Utils.elementsAreUnique(list));
    }
    
    @Test
    public void elementsAreUnique_singleElementShouldReturnTrue() {
        list.add(1);
        assertTrue("Collection with a single elements must return true", Utils.elementsAreUnique(list));
    }
    
    @Test
    public void elementsAreUnique_duplicateElementShouldReturnFalse() {
        list.add(1);
        list.add(1);
        list.add(2);
        assertFalse("Collection with duplicate elements must return false", Utils.elementsAreUnique(list));
    }

}
