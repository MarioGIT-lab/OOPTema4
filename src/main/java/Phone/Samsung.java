package Phone;

public abstract class Samsung extends Phone {
    public Samsung(Color color, Material material, String IMEI) {
        super(color, material, IMEI, 19); // Samsung phones start with 19% battery
    }
}
