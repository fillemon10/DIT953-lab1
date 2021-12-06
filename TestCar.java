import Movable.Saab95;
import Movable.Vehicle;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author A13
 */
public class TestCar {
    static Vehicle car = new Saab95(0,0);
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
        assertEquals("Movable.Saab95",car.getModelName());
    }
    @Test
    public void testVector(){
        car.turnLeft();
        assertEquals(PI/2+PI/6,car.getDirection().getAngle());
        car.turnRight();
        assertEquals(PI/2,car.getDirection().getAngle());
        car.getPosition().setX(5);
        assertEquals(5,car.getPosition().getX());
        car.getPosition().setY(5);
        assertEquals(5,car.getPosition().getY());
    }
    @Test
    public void testMove(){
        car.gas(1);
        car.move();
        System.out.println("Curr pos: " + car.getPosition().getY() + ", Speed: " + car.getCurrentSpeed() + ", Direction y: " + car.getDirection().getY());
        assertEquals(100.125,car.getPosition().getY());
        car.brake(1);
    }



}
