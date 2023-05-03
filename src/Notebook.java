public class Notebook extends Productos {
    private String fabricante;
    private Double gigasMemoria;

    public Notebook(String nombre, Double precio, Integer stock, String fabricante, Double gigasMemoria) {
        super(nombre, precio, stock);
        this.fabricante = fabricante;
        this.gigasMemoria = gigasMemoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getGigasMemoria() {
        return gigasMemoria;
    }

    public void setGigasMemoria(Double gigasMemoria) {
        this.gigasMemoria = gigasMemoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "fabricante='" + fabricante + '\'' +
                ", gigasMemoria=" + gigasMemoria +
                "} " + super.toString();
    }
}
