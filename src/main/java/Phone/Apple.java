package Phone;

public abstract class Apple extends Phone {
    public Apple(Color color, Material material, String IMEI) {
        super(color, material, IMEI, 20); // Apple phones start with 20% battery
    }
}
