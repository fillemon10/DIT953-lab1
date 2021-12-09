package MovablePackage;

import java.awt.*;

/**
 * @author A13
 */
public abstract class Truck extends Vehicle  {

    private Platform platform;

    public Truck(int nrDoors, int enginePower, Color color, String modelName,int x, int y, IPlatformLogic platformLogic) {
        super(nrDoors, enginePower, color, modelName,x,y);
        platform = new Platform(platformLogic);
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

    public boolean isPlatformRaised(){
        return platform.isRaised();
    }


    public void raisePlatform(){
        if (getCurrentSpeed() == 0)
            platform.raisePlatform();
    }
    public void lowerPlatform(){
        if (getCurrentSpeed() == 0){
            platform.lowerPlatform();
        }
    }
}
