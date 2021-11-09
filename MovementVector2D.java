import static java.lang.Math.PI;

public class MovementVector2D {
    private double xDirection;
    private double yDirection;
    private double angle;
    public MovementVector2D(){
        this.xDirection = 0;
        this.yDirection = 1;
        this.angle = PI/2;

    }

    public void updateDirection(double newAngle){
        yDirection = Math.sin(newAngle);
        xDirection = Math.cos(newAngle);
    }

    public double getxDirection() {
        return xDirection;
    }

    public double getyDirection() {
        return yDirection;
    }

    public double getAngle() {
        return angle;
    }
}
