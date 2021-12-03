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
    public Volvo240(){
        super(4,100, Color.black,"Movable.Volvo240");
        stopEngine();
    }

    /**
     * @return speedFactor
     */
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
}
