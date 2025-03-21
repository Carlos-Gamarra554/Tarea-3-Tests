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
        assertEquals(4 * Math.PI * Math.pow(esfera.getRadio(), 2), esfera.area());
        assertEquals(2 * Math.PI * cilindro.getRadio() * (cilindro.getRadio() + cilindro.getAltura()), cilindro.area());
        assertEquals(rectangulo.getLongitud() * rectangulo.getAncho(), rectangulo.area());
    }
}