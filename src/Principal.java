public class Principal {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4);
        r1.establecerAnchura(4);
        r1.establecerAltura(3);
        System.out.println("Area de R1: " + r1.obtenerArea() + ". Perimetro de R1: " + r1.obtenerPerimetro());
        r1.cambiarDimensiones(3, 2);
        System.out.println("Area de R1: " + r1.obtenerArea() + ". Perimetro de R1: " + r1.obtenerPerimetro());
    }
}