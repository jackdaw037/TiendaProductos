public class Producto {

    private String nombre;
    private int precioUnitario;

    public Producto(String nombre, int precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre +
                " | Precio: " + precioUnitario + "€");
    }
}