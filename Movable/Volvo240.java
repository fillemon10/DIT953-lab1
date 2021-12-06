package Movable;

import java.awt.*;

/**
 * @author A13
 */
public class Volvo240 extends Vehicle implements Car {

    public final static double trimFactor = 1.25;

    /**
     * @see Vehicle#Vehicle
     */
    public Volvo240(int x, int y){
        super(4,100, Color.black,"Volvo240",x,y);
        stopEngine();
    }

    /**
     * @return speedFactor
     */
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
}
