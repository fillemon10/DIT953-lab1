package Movable;

import java.awt.*;

public class CarTransport extends Truck implements Movable{

    private final double PICKUP_RANGE = 5;
    private final int PLATFORM_SIZE = 4;
    private boolean platformState;
    private Carloader<Vehicle> carloader = new Carloader<>();
    /**
     * @param platform
     * @see Vehicle#Vehicle
     */
    public CarTransport(Platform platform) {
        super(2,200, Color.white, "Movable.Scania",
                new Platform(0,false));
    }

    @Override
    public void move(){
        super.move();
        for (Vehicle car : carloader.getVehicles()) {
            car.getPosition().setX(getPosition().getX());
            car.getPosition().setY(getPosition().getY());
        }
    }

    public void changePlatformstate(){
        getPlatform().changPlatformstate();
    }

    public void loadRamp(Vehicle car){
        if(getPosition().getDistance(car.getPosition()) <= PICKUP_RANGE &&
                (car instanceof Car) && getPlatform().isRaised() && carloader.getVehicles().size() < PLATFORM_SIZE){
            carloader.loadCar(car);        }
    }
    public void unLoadRamp(){
        if (!carloader.getVehicles().isEmpty() && !getPlatform().isRaised()){
            Vehicle car = carloader.unloadCar();
            car.getPosition().setX(getPosition().getX() + 5);
            car.getPosition().setY(getPosition().getY());
        }
    }

}
