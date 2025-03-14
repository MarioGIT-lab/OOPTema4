package Phone;

public class Message {
    protected String phoneNumber;
    protected String message;

    public Message(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Phone number: " + phoneNumber + "\nMessage: " + message;
    }
}
