import java.awt.*;

public class Scania extends Vehicle implements Movable  {

    private Platform platform;

    public Scania(Platform platform) {
        super(2, 200, Color.white, "Scania");
        this.platform = platform;
        stopEngine();
    }

    public boolean isPlatformRaised() {
        int angle = platform.getAngle();
        if(angle != 0){
            return true;
        } else {
            return false;
        }
    }
}
