public class Triangulo extends Figura {

    private int anchura;
    private int altura;

    public Triangulo(int numerodelados) {
        super(numerodelados);
    }
    public int obtenerAnchura() {
        return anchura;
    }
    public void establecerAnchura(int anchura) {
        this.anchura = anchura;
    }
    public int obtenerAltura() {
        return altura;
    }
    public void establecerAltura(int altura) {
        this.altura = altura;
    }
    @Override
    public int obtenerArea() {
        return (anchura*altura)/2;
    }
    @Override
    public int obtenerPerimetro() {
        return anchura*3;
    }
}