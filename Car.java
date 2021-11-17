import java.awt.*;
import static java.lang.Math.PI;

public abstract class Car implements Movable {
    private static final double turnAngle = PI/2;

    private Vector2D position = new Vector2D(0,0);
    private Vector2D direction = new Vector2D();
//change
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public String getModelName(){ return modelName; }

    public Vector2D getDirection(){ return direction; }

    public Vector2D getPosition(){return position; }
    public void setColor(Color clr){
        color = clr;
    }
    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }
    protected double speedFactor() {
        return 0;
    }

    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

        // TODO fix this method according to lab pm
    public void gas(double amount){
        amount = Math.max(amount,0);
        amount = Math.min(1,amount);
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        amount = Math.max(amount,0);
        amount = Math.min(1,amount);
        decrementSpeed(amount);
    }

    public void move(){
        double x = position.getX()+direction.getX() * currentSpeed;
        double y = position.getY()+direction.getY() * currentSpeed;
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
