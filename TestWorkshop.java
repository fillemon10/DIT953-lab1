import org.junit.jupiter.api.Test;

import java.util.List;

public class TestWorkshop {
    static Workshop<Vehicle> workshop = new Workshop<>(6,"vehicleWorkshop");
    static Workshop<Saab95> saab95Workshop = new Workshop<>(6,"saab95Workshop");
    static Workshop<Volvo240> volvo240Workshop = new Workshop<>(6,"volvo240Workshop");
    static Workshop<Truck> truckWorkshop = new Workshop<>(6,"truckWorkshop");

@Test
    public void TestLoad(){
    workshop.loadCar(new Saab95());
    saab95Workshop.loadCar(new Saab95());
    //volvo240Workshop.loadCar(new Saab95());
    //truckWorkshop.loadCar(new Saab95());
}
}
