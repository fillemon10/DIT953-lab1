import Movable.Saab95;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author A13
 */
public class TestSaab95 {
    static Saab95 saab95 = new Saab95();

    @Test
    public void testTurbo() {
        saab95.setTurboOn();
        saab95.gas(2);
        assertEquals(1.625,saab95.getCurrentSpeed());
        saab95.brake(2);
        saab95.setTurboOff();
    }
}
