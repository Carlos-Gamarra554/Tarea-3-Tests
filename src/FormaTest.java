import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    Esfera esfera = new Esfera(4.5);
    Cilindro cilindro = new Cilindro(5, 12);
    Rectangulo rectangulo = new Rectangulo(6, 1.2);

    @Test
    void testToString() {
        assertEquals("Figura: esfera, Radio: " + esfera.getRadio() + "cm", esfera.toString());
        assertEquals("Figura: cilindro, Radio: " + cilindro.getRadio() + "cm, altura: " + cilindro.getAltura() + "cm", cilindro.toString());
        assertEquals("Figura: rectángulo, Longitud: " + rectangulo.getLongitud() + "cm, ancho: " + rectangulo.getAncho() + "cm", rectangulo.toString());
    }

    @Test
    void testArea() {
        double error = 0.01;

        assertEquals(254.46, esfera.area(), error);
        assertEquals(534.07, cilindro.area(), error);
        assertEquals(7.19, rectangulo.area(), error);
    }
}