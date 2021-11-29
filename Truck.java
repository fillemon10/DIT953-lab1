import java.awt.*;

/**
 * @author A13
 */
public abstract class Truck extends Vehicle implements Movable  {

    private Platform platform;

    /**
     * @param platform
     * @see Vehicle#Vehicle
     */
    public Truck(int nrDoors, int enginePower, Color color, String modelName, Platform platform) {
        super(nrDoors, enginePower, color, modelName);
        this.platform = platform;
        stopEngine();
    }

    @Override
    public double speedFactor(){
        return getEnginePower();
    }

    @Override
    public void gas(double amount){
        if(!platform.isRaised()){
            amount = Math.max(amount,0);
            amount = Math.min(1,amount);
            incrementSpeed(amount);
        }
    }

    public void raisePlatform(int amount){
        if (getCurrentSpeed() == 0)
            platform.changeAngle(amount);
    }
}
