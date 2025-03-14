package Phone;

public class Main {
    public static void main(String[] args) {

        // Phone phone= new Samsung(); // shouldn't compile

        Phone phone = new SamsungGalaxyJ5(Color.BLUE, Material.GLASS, "351234567890123");

        phone.addContact(1, "0773123145", "Rocxoiu", "Mario");
        phone.addContact(2, "0732415160", "Iosif", "Matei");

        phone.getFirstContact();
        phone.getLastContact();


        phone.sendMessage("0773123145", "Hi, I contact you as your car is parked illegally.");
        phone.sendMessage("0773123145", "Please answer as soon as possible.");

        phone.getFirstMessage("0773123145");
        phone.getSecondMessage("0773123145");

        phone.call("0732415160");

        phone.viewHistory();
    }
}