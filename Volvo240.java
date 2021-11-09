import java.awt.*;
import java.util.concurrent.CountDownLatch;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
    
    public Volvo240(){
        super(4,100, Color.black,"Volvo240");
        stopEngine();
    }
    
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }
}
