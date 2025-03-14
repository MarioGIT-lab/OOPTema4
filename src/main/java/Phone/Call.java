package Phone;

public class Call {
    protected String phoneNumber;

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "You are currently calling " + phoneNumber + ". ";
    }
}
