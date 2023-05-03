public class Impresora extends  Productos implements  iOfertasEspeciales{
    private String fabricante;
    private Integer iPm;

    public Impresora(String nombre, Double precio, Integer stock, String fabricante, Integer iPm) {
        super(nombre, precio, stock);
        this.fabricante = fabricante;
        this.iPm = iPm;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getiPm() {
        return iPm;
    }

    public void setiPm(Integer iPm) {
        this.iPm = iPm;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "fabricante='" + fabricante + '\'' +
                ", iPm=" + iPm +
                "} " + super.toString();
    }

    @Override
    public Double aplicarDescuento(int porcentaje) {
        //        Se utiliza el tipo de dato INT para que no genere inconvenientes a la hora de dividir por un double

        Double precio = getPrecio();
       return (precio-precio/100.00*porcentaje);


    }
}
