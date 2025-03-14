package Phone;

public class Contact {
    protected int ContactID;
    private String phoneNumber;
    protected String firstName;
    protected String lastName;

    public Contact(int contactID, String phoneNumber, String firstName, String lastName) {
        this.ContactID = contactID;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact ID: " + ContactID + ", phone number: " + phoneNumber + ", first name: " + firstName + ", last name: " + lastName + "\n";
    }
}
