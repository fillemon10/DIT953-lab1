import java.awt.*;

public class carTransport extends Vehicle{

    /**
     * @param nrDoors
     * @param enginePower
     * @param color
     * @param modelName
     */
    private Platform platform;
    private Vehicle car;
    private int maxCar;

    public carTransport(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }



}
