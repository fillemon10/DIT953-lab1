import Movable.Platform;
import Movable.Scania;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author A13
 */
public class TestScania {
    static Scania scania = new Scania(new Platform(70, false));

    @Test
    public void testTurbo() {
        scania.gas(2);
        assertEquals(2,scania.getCurrentSpeed());
        scania.brake(2);
    }
}
