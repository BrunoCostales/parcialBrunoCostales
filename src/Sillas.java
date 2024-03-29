public class Sillas extends Productos implements  iOfertasEspeciales{
    private Boolean ruedas;

    public Sillas(String nombre, Double precio, Integer stock, Boolean ruedas) {
        super(nombre, precio, stock);
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                "ruedas=" + ruedas +
                "} " + super.toString();
    }
    @Override
    public Double aplicarDescuento(int porcentaje) {
       //        Se utiliza el tipo de dato INT para que no genere inconvenientes a la hora de dividir por un double
        Double precio=getPrecio();
        return (precio - precio/100.00*porcentaje);


    }
}
