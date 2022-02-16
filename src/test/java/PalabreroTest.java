import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalabreroTest {

    @Test
    void contarLetras() {
        assertEquals(3,Palabrero.contarLetras("cadena",'a'));
    }
}