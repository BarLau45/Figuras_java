public class Rectangulo extends Figura implements IRedimensionar {
    
    private int anchura;
    private int altura;

    public Rectangulo(int numerodelados) {
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
        return anchura*altura;
    }
    @Override
    public int obtenerPerimetro() {
        return (anchura*2) + (altura*2);
    }
    @Override
    public void cambiarDimensiones(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }
}