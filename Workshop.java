import java.util.List;

public class Workshop<P extends Vehicle> {
    private List<P> vehicles;
    private int workshopSize;
    private String name;

    public Workshop(P allowedCarType, int workshopSize, String name) {
        this.workshopSize = workshopSize;
        this.name = name;
    }

    public void loadCars(List<P> cars){
        for (P car : cars) {
            vehicles.add(car);
        }
    }
}
