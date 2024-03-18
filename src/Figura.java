public abstract class Figura {
    private int numerodelados;

    public Figura(int numerodelados) {

    }
    public int obtenerNumeroDeLados() {
        return numerodelados;
    }
    public abstract int obtenerArea();

    public abstract int obtenerPerimetro();
}