package seedu.addressbook.data.person;

public class PostalCode {
    final String postalCode;
    
    public PostalCode (String input) {
        postalCode = input;
    }
    
    public String getPostalCode () {
        return postalCode; 
    }
}
