package seedu.addressbook.data.person;

public class Contact {
    public String value;
    public boolean isPrivate;

    public Contact() {
        super();
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}