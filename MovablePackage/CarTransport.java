package MovablePackage;

import java.awt.*;

public class CarTransport extends Truck {

    private final double PICKUP_RANGE = 5;
    private final int PLATFORM_SIZE = 4;
    private Carloader<Vehicle> carloader = new Carloader<Vehicle>();


    public CarTransport(int x, int y) {
        super(2,200, Color.white,
                "CarTransport",x,y,new BinaryPlatformStrategy());
    }

    @Override
    public void move(){
        super.move();
        for (Vehicle car : carloader.getVehicles()) {
            car.getPosition().setX(getPosition().getX());
            car.getPosition().setY(getPosition().getY());
        }
    }

    public void loadRamp(Vehicle car){
        if(getPosition().getDistance(car.getPosition()) <= PICKUP_RANGE &&
                (car instanceof Car) && isPlatformRaised() && carloader.getVehicles().size() < PLATFORM_SIZE){
            carloader.loadCar(car);        }
    }
    public void unLoadRamp(){
        if (!carloader.getVehicles().isEmpty() && !isPlatformRaised()){
            Vehicle car = carloader.unloadCar();
            car.getPosition().setX(getPosition().getX() + 5);
            car.getPosition().setY(getPosition().getY());
        }
    }

}
