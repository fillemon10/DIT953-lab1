import org.junit.jupiter.api.Test;
import static java.lang.Math.PI;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCar {
    static Car car = new Saab95();
    @Test
    public void testSpeed() {
        System.out.println(car.getCurrentSpeed());
        assertEquals(0, car.getCurrentSpeed());
    }
    @Test
    public void testDoors(){
        assertEquals(2,car.getNrDoors());
    }
    @Test
    public void testGas(){
        car.gas(1);
        assertEquals(1.25,car.getCurrentSpeed());
        car.brake(1);
    }
    @Test
    public void testEngine(){
        assertEquals(125,car.getEnginePower());
        car.startEngine();
        assertEquals(0.1,car.getCurrentSpeed());
        car.stopEngine();
        assertEquals(0,car.getCurrentSpeed());
    }
    @Test
    public void testColour(){
        assertEquals(Color.red,car.getColor());
        car.setColor(Color.blue);
        assertEquals(Color.blue,car.getColor());
        car.setColor(Color.red);
    }
    @Test
    public void testName(){
        assertEquals("Saab95",car.getModelName());
    }
    @Test
    public void testDirection(){
        car.turnLeft();
        assertEquals(PI,car.getDirection().getAngle());
        car.turnRight();
        assertEquals(PI/2,car.getDirection().getAngle());
    }
    @Test
    public void testMove(){
        car.gas(2);
        //car.move();
        System.out.println("Curr pos: " + car.getPosition().getY() + ", Speed: " + car.getCurrentSpeed() + ", Direction y: " + car.getDirection().getY());
        assertEquals(1.25,car.getPosition().getY());
        car.brake(2);
    }



}
