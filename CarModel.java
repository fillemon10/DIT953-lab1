import MovablePackage.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarModel {
    private List<Vehicle> vehicles;
    public CarModel(){
        vehicles = new ArrayList<>();
        vehicles.add(new Volvo240(0,0));
        vehicles.add(new Saab95(100,0));
        vehicles.add(new Scania(200,0));
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
