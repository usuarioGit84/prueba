import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Suma dos números")
    void add() {

        assertEquals(4,Calculator.add(2,2));
    }

    @Test
    void multiply() {
        assertAll(()->assertEquals(4,Calculator.multiply(2,2)),
                ()->assertEquals(-4,Calculator.multiply(2,-2)),
                ()->assertEquals(4,Calculator.multiply(-2,-2)),
                ()->assertEquals(0,Calculator.multiply(2,0)),
                ()->assertTrue(5<Calculator.multiply(2,0)));

    }
}