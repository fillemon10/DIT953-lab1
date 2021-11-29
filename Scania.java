import java.awt.*;

public class Scania extends Vehicle implements Movable  {

    private Platform platform;

    public Scania(Platform platform) {
        super(2, 200, Color.white, "Scania");
        this.platform = platform;
        stopEngine();
    }

    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

    public void raisePlatform(){
        if (getCurrentSpeed() != 0){
            platform.changeAngle(2);
        }
    }

    @Override
    public void gas(double amount){
        if (!platform.isRaised()){
            amount = Math.max(amount,0);
            amount = Math.min(1,amount);
            incrementSpeed(amount);
        }
    }




}
