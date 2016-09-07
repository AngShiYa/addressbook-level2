package seedu.addressbook.data.person;

/**
 * A print-only immutable interface for a Person's details in the addressbook.
 * Implementations should guarantee: details are printed in certain format.
 */
public interface Printable {
    
    /**
     * The returned String should follow the format 'detailType: detail'
     */
    public String getPrintableString();
}
