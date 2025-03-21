public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double getCobertura() {
        return cobertura;
    }

    public double pintar(Forma forma) {
        return forma.area() / cobertura;
    }
}