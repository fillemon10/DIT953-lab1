package Movable;

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
    public Truck(int nrDoors, int enginePower, Color color, String modelName, Platform platform,int x, int y) {
        super(nrDoors, enginePower, color, modelName,x,y);
        this.platform = platform;
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

    /**
     * @param amount
     */
    public void raisePlatform(int amount){
        if (getCurrentSpeed() == 0)
            platform.changeAngle(amount);
    }
}
