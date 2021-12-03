package Movable;

import java.util.List;

public class Workshop<P extends Vehicle> {
    private Carloader<P> carloader = new Carloader<>();
    private int workshopSize;
    private String name;

    public Workshop(int workshopSize, String name) {
        this.workshopSize = workshopSize;
        this.name = name;
    }

    public void loadCars(List<P> cars){
        for (P car : cars) {
            if (carloader.getVehicles().size() < workshopSize){
                loadCar(car);
            }
        }
    }
    public void loadCar(P car){
        carloader.loadCar(car);
    }
    public P unloadCar(){
        return carloader.unloadCar();
    }
}
