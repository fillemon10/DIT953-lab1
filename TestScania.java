import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScania {
    static Scania scania = new Scania(new Platform(70, false));

    @Test
    public void testTurbo() {
        scania.gas(2);
        assertEquals(1.25,scania.getCurrentSpeed());
        scania.brake(2);
    }
}
