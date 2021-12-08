package MovablePackage;

import java.awt.*;

/**
 * @author A13
 */
public class Saab95 extends Vehicle implements Car {

    public boolean turboOn;

    /**
     *
     */
    public Saab95(int x, int y){
        super(2,115,Color.red,"Saab95",x,y);
	    turboOn = false;
        stopEngine();
    }

    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    /**
     * @return speedFactor for Movable.Saab95
     */
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}
