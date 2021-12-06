package Movable;

import java.awt.*;

public class Scania extends Truck implements Movable{

    /**
     * @param nrDoors
     * @param enginePower
     * @param color
     * @param modelName
     */
    private Platform platform;

    /**
     * @param platform
     * @see Vehicle#Vehicle
     */
    public Scania(int x, int y) {
        super(2,75, Color.white, "Scania", new Platform(0,false),x,y);
    }
}
