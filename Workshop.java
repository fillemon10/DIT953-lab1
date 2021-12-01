import java.util.List;

public class Workshop<P extends Vehicle> {
    private List<P> vehicles;
    private int workshopSize;
    private String name;

    public Workshop(int workshopSize, String name) {
        this.workshopSize = workshopSize;
        this.name = name;
    }

    public void loadCars(List<P> cars){
        for (P car : cars) {
            if (vehicles.size() < workshopSize){
                vehicles.add(car);
            }
        }
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
