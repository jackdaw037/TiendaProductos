import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;

    public Tienda() {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void agregarProductos(Producto pro) {
        productos.add(pro);
    }

    public void agregarCliente(Cliente cli) {
        clientes.add(cli);
    }

    public void agregarPedido(Pedido ped) {
        pedidos.add(ped);
    }

    public void listaClientes(){
        System.out.println("\n ==== CLIENTES ==== ");
        for (Cliente cli : clientes){
            cli.mostrarCliente();
        }
    }

    public void listaProductos(){
        System.out.println("\n ==== Productos ==== ");
        for (Producto pro : productos){
            pro.mostrarProducto();
        }
    }

}