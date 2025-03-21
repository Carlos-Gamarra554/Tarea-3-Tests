import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void testPintar() {
        Forma esfera = new Esfera(5.6);
        Pintura pintura = new Pintura(500);

        assertEquals(esfera.area() / pintura.getCobertura(), pintura.pintar(esfera));
    }
}