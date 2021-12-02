import java.awt.*;
import static java.lang.Math.PI;

/**
 * @author A13
 */
public abstract class Vehicle implements Movable {
    private static final double turnAngle = PI/6;

    private Vector2D position = new Vector2D(100,100);
    private Vector2D direction = new Vector2D();
    //change
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    /**
     * @param nrDoors
     * @param enginePower
     * @param color
     * @param modelName
     */
    public Vehicle(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    /**
     * @return nrDoors
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /**
     * @return enginePower
     */
    public double getEnginePower(){
        return enginePower;
    }

    /**
     * @return currentSpeed
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /**
     * @return color
     */
    public Color getColor(){
        return color;
    }

    /**
     * @return modelName
     */
    public String getModelName(){ return modelName; }

    /**
     * @return direction
     */
    public Vector2D getDirection(){ return direction; }

    /**
     * @return position
     */
    public Vector2D getPosition(){return position; }

    /**
     * @param clr color
     */
    public void setColor(Color clr){
        color = clr;
    }
    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
     * @return speedFactor
     */
    protected double speedFactor() {
        return 0;
    }

    /**
     * @param amount
     */
    private void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    /**
     * @param amount
     */
    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    /**
     * @param amount
     */
    public void gas(double amount){
        amount = Math.max(amount,0);
        amount = Math.min(1,amount);
        incrementSpeed(amount);
    }

    /**
     * @param amount
     */
    public void brake(double amount){
        amount = Math.max(amount,0);
        amount = Math.min(1,amount);
        decrementSpeed(amount);
    }

    /**
     * @param maxX
     * @param maxY
     * @param minX
     * @param minY
     */
    public void move(double maxX, double maxY, double minX, double minY){
        double x = Math.max(Math.min(maxX,position.getX()+direction.getX() * currentSpeed * 0.01),minX);
        double y = Math.max(Math.min(maxY,position.getY()+direction.getY() * currentSpeed * 0.01),minY);
        //position = new Position2D(x,y);
        position.setX(x);
        position.setY(y);
    }
    public void move(){
        double x = position.getX()+direction.getX() * currentSpeed * 0.1;
        double y = position.getY()+direction.getY() * currentSpeed * 0.1;
        //position = new Position2D(x,y);
        position.setX(x);
        position.setY(y);
    }

    public void turnRight(){
        direction.updateDirection(direction.getAngle() - turnAngle);
    }

    public void turnLeft(){
        direction.updateDirection(direction.getAngle() + turnAngle);

    }
}