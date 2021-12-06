import Movable.*;
import org.junit.jupiter.api.Test;

public class TestWorkshop {
    static Workshop<Vehicle> workshop = new Workshop<>(6,"vehicleWorkshop");
    static Workshop<Saab95> saab95Workshop = new Workshop<>(6,"saab95Workshop");
    static Workshop<Volvo240> volvo240Workshop = new Workshop<>(6,"volvo240Workshop");
    static Workshop<Truck> truckWorkshop = new Workshop<>(6,"truckWorkshop");

@Test
    public void TestLoad(){
    workshop.loadCar(new Saab95(0,0));
    saab95Workshop.loadCar(new Saab95(0,0));
    //volvo240Workshop.loadCar(new Movable.Saab95());
    //truckWorkshop.loadCar(new Movable.Saab95());
}
}
