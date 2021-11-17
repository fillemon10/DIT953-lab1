import static java.lang.Math.PI;

public class Vector2D {
    private double x;
    private double y;
    private double angle;
    public Vector2D(){
        this.x = 0;
        this.y = 1;
        this.angle = PI/2;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void updateDirection(double newAngle){
        angle = newAngle;
        y = Math.sin(newAngle);
        x = Math.cos(newAngle);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAngle() {
        return angle;
    }
}
