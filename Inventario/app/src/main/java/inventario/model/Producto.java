package inventario.model;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private String codigo;

    public Producto(String nombre, double precio, int cantidad, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;   
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void mostrarProducto(){
        System.out.printf("Código: %s, Nombre: %s, Precio: %.2f, Cantidad: %d%n",
        codigo, nombre, precio, cantidad);
    }
}