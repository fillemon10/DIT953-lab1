import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CarTransport extends Truck implements Movable{

    private final double PICKUP_RANGE = 5;
    private final int PLATFORM_SIZE = 4;
    private List<Vehicle> cars;
    /**
     * @param platform
     * @see Vehicle#Vehicle
     */
    public CarTransport(Platform platform) {
        super(2,200, Color.white, "Scania",
                new Platform(0,false));
    }

    @Override
    public void raisePlatform(int amount) {
        super.raisePlatform(1);
    }
    @Override
    public void move(){
        super.move();
        for (Vehicle car : cars) {
            car.getPosition().setX(getPosition().getX());
            car.getPosition().setY(getPosition().getY());
        }
    }
    public void lowerPlatform(){
        super.raisePlatform(-1);
    }
    public void loadRamp(Vehicle car){
        if(getPosition().getDistance(car.getPosition()) <= PICKUP_RANGE &&
                (car instanceof Car) && getPlatform().isRaised() && cars.size() < PLATFORM_SIZE){
            cars.add(car);
        }
    }
    public void unLoadRamp(){
        if (!cars.isEmpty() && !getPlatform().isRaised()){
            Vehicle car = cars.remove(cars.size()-1);
            car.getPosition().setX(getPosition().getX() + 5);
            car.getPosition().setY(getPosition().getY());
        }
    }

}
