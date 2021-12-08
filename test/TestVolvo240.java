package test;

import MovablePackage.Volvo240;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author A13
 */
public class TestVolvo240 {
    static Volvo240 volvo240 = new Volvo240(0,0);

    @Test
    public void testTurbo() {
        volvo240.gas(2);
        assertEquals(1.25,volvo240.getCurrentSpeed());
        volvo240.brake(2);
    }
}
