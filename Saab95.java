import java.awt.*;

public class Saab95 extends Vehicle {

    public boolean turboOn;

    /**
     * @see Vehicle#Vehicle
     */
    public Saab95(){
        super(2,125,Color.red,"Saab95");
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
     * @return speedFactor for Saab95
     */
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}
