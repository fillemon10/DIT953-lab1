import java.awt.*;
import static java.lang.Math.PI;

public abstract class Car implements Moveable{
    private static final double turnAngle = PI/12;

    private Position2D position = new Position2D(0,0);
    private MovementVector2D direction = new MovementVector2D();

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

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

    protected void incrementSpeed(double amount){

    }

    protected void decrementSpeed(double amount){

    }

        // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    public void move(){
        position.setXPos(position.getXPos()+direction.getxDirection() * currentSpeed);
        position.setYPos(position.getYPos()+direction.getyDirection() * currentSpeed);
    }

    public void turnRight(){
        direction.updateDirection(direction.getAngle() - turnAngle);
    }

    public void turnLeft(){
        direction.updateDirection(direction.getAngle() + turnAngle);

    }
}
