public class Rectangulo extends Forma{
    private double longitud;
    private double ancho;

    public Rectangulo(double lado1, double lado2) {
        super("Rectangulo");
        this.longitud = lado1;
        this.ancho = lado2;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public double area() {
        return longitud * ancho;
    }

    public String toString(){
        return "Figura: rectángulo, Longitud: " + longitud + "cm, ancho: " + ancho + "cm";
    }
}
