package test;

import MovablePackage.Scania;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author A13
 */
public class TestScania {
    static Scania scania = new Scania(0,0);

    @Test
    public void testTurbo() {
        scania.gas(2);
        assertEquals(2,scania.getCurrentSpeed());
        scania.brake(2);
    }
}
