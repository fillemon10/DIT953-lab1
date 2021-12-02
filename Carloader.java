import java.util.List;

public class Carloader<P extends Vehicle> {
    private List<P> vehicles;

    public Carloader(){}
    public List<P> getVehicles() {
        return vehicles;
    }

    public void loadCar(P car){
        vehicles.add(car);
    }
    public P unloadCar(){
        if (!vehicles.isEmpty()){
            return vehicles.remove(vehicles.size()-1);
        }
        else {
            return null;
        }
    }
}
