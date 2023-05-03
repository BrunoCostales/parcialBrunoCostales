public abstract class Productos {
    private String nombre;
    private Double precio;
    private Integer stock;

    public Productos(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    //Se solicita actualizar el valor de los precios del array del ejercicio 3. Esto se debe realizar a través
    //de un método de la clase.Por ello que se implementa en este lugar
    public void aumentarPrecios (int porcentaje){
       this.precio=this.precio+ (this.precio /100 *porcentaje);
       setPrecio(this.precio);

    }
}
