import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void testPintar() {
        Forma esfera = new Esfera(5.6);
        Pintura pintura = new Pintura(500);

        double expected = 0.788;
        double actual = pintura.pintar(esfera);
        double margenError = 0.001;

        assertEquals(expected, actual, margenError, "El valor no es correcto.");
    }
}