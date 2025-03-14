package Phone;

import java.util.ArrayList;
import java.util.List;

    public abstract class Phone implements PhoneBehaviour {
        protected int batteryLife;
        protected Color color;
        protected Material material;
        protected String IMEI;
        protected List<Contact> contacts = new ArrayList<>();
        protected List<Message> messages = new ArrayList<>();
        protected List<Call> calls = new ArrayList<>();

        public Phone(Color color, Material material, String IMEI, int batteryLife) {
            this.color = color;
            this.material = material;
            this.IMEI = IMEI;
            this.batteryLife = batteryLife;
        }

        @Override
        public void addContact(int contactID, String phoneNumber, String firstName, String lastName) {
            contacts.add(new Contact(contactID, phoneNumber, firstName, lastName));
        }

        @Override
        public void getFirstContact() {
            if (!contacts.isEmpty()) {
                Contact contact = contacts.getFirst();
                System.out.println("First name: " + contact.firstName + "\nLast name: " + contact.lastName + "\n");
            } else {
                System.out.println("No contacts available.");
                System.out.println();
            }
        }

        @Override
        public void getLastContact() {
            if (!contacts.isEmpty()) {
                Contact contact = contacts.getLast();
                System.out.println("First name: " + contact.firstName + "\nLast name: " + contact.lastName);
                System.out.println();
            } else {
                System.out.println("No contacts available.");
                System.out.println();
            }
        }

        @Override
        public void sendMessage(String phoneNumber, String message) {
            if (batteryLife >= 1 && message.length() <= 500) {
                messages.add(new Message(phoneNumber, message));
                batteryLife--;
            } else {
                System.out.println("Not enough battery for a message or message is too long.");
                System.out.println();
            }
        }

        @Override
        public void getFirstMessage(String phoneNumber) {
            if (!messages.isEmpty()) {
                System.out.println("Phone number: " + phoneNumber);
                System.out.println("Message 1: " + messages.getFirst().message);
                System.out.println();
            } else {
                System.out.println("No messages available.");
                System.out.println();
            }
        }

        @Override
        public void getSecondMessage(String phoneNumber) {
            if (messages.size() > 1) {
                System.out.println("Phone number: " + phoneNumber);
                System.out.println("Message 2: " + messages.get(1).message);
                System.out.println();
            } else {
                System.out.println("No second message available.");
                System.out.println();
            }
        }

        @Override
        public void call(String phoneNumber) {
            if (batteryLife >= 2) {
                calls.add(new Call(phoneNumber));
                batteryLife -= 2;
                System.out.println("You are currently calling: " + phoneNumber);
                System.out.println();
            } else {
                System.out.println("Not enough battery for a call.");
                System.out.println();
            }
        }

        @Override
        public void viewHistory() {
            System.out.println("Call History:");
            for (Call call : calls) {
                System.out.println(call);
                System.out.println();
            }

            System.out.println("Message History:");
            for (Message message : messages) {
                System.out.println(message);
                System.out.println();
            }
        }
    }
