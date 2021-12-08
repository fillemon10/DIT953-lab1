package MovablePackage;

import java.awt.*;

/**
 * @author A13
 */
public abstract class Truck extends Vehicle  {

    private Platform platform = new Platform();

    public Truck(int nrDoors, int enginePower, Color color, String modelName,int x, int y) {
        super(nrDoors, enginePower, color, modelName,x,y);
        stopEngine();
    }

    /**
     * @return enginePower
     */
    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

    /**
     * @param amount
     */
    @Override
    public void gas(double amount){
        if(!platform.isRaised()){
            super.gas(amount);
        }
    }

    /**
     * @return platform
     */
    public Platform getPlatform(){
        return platform;
    }

    public void changePlatformState(){
        platform.changPlatformState();
    }

    public boolean isPlatformRaised(){
        return platform.isRaised();
    }

    /**
     * @param amount
     */
    public void raisePlatform(int amount){
        if (getCurrentSpeed() == 0)
            platform.changeAngle(amount);
    }
}
