package seedu.addressbook.data.person;

public abstract class Contact {

    protected String value;
    protected boolean isPrivate;
    
    public Contact() { }
    
    public Contact(String value, boolean isPrivate) {
        this.value = value;
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public abstract boolean equals(Object other);

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
    public String getValue() {
        return value;
    }
}
