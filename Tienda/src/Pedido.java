import java.util.ArrayList;

public class Pedido {

    private Cliente cliente;
    private ArrayList<LineaProducto> lineas;
    private double costeTotal;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
        this.costeTotal = 0;
    }

    public void agregarLinea(LineaProducto linea) {
        lineas.add(linea);
        calcularCosteTotal();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        LineaProducto linea = new LineaProducto(producto, cantidad);
        lineas.add(linea);
        calcularCosteTotal();
    }

    private void calcularCosteTotal() {
        costeTotal = 0;
        for (LineaProducto lp : lineas) {
            costeTotal += lp.getPrecioTotal();
        }
    }

    public void mostrarPedido() {

        System.out.println("\n--- Pedido ---");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Productos:");

        for (LineaProducto lp : lineas) {
            System.out.println("• " + lp.getProducto().getNombre()
                    + " | Cantidad: " + lp.getCantidad()
                    + " | Subtotal: " + lp.getPrecioTotal() + "€");
        }

        System.out.println("Coste Total: " + costeTotal + "€");
    }
}