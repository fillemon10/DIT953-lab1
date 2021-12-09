package MovablePackage;

import java.awt.*;

public class Scania extends Truck{
    public Scania(int x, int y) {
        super(2, 75, Color.white, "Scania", x, y, new AnglePlatformStrategy() {
        });
    }
}
