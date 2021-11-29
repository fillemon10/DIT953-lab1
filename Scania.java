import java.awt.*;

public class Scania extends Vehicle implements Movable  {

    private Platform platform;

    /**
     * @param platform
     * @see Vehicle#Vehicle
     */
    public Scania(Platform platform) {
        super(2, 200, Color.white, "Scania");
        this.platform = platform;
        stopEngine();
    }

    @Override
    public double speedFactor(){
        return getEnginePower();
    }

    public boolean isPlatformRaised() {
        int angle = platform.getAngle();
        if(angle != 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrivable(){
        return !isPlatformRaised();
    }

    //TODO
    public void inMotion(){
        int angle = platform.getAngle();

    }
}
