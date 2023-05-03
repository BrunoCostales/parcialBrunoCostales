public class Escritorios extends  Productos{
    private Double ancho;
    private Double alto;

    public Escritorios(String nombre, Double precio, Integer stock, Double ancho, Double alto) {
        super(nombre, precio, stock);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Escritorios{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} " + super.toString();
    }
}
