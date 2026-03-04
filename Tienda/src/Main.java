public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        Producto p1 = new Producto("Portátil", 950);
        Producto p2 = new Producto("Ratón", 65);
        Producto p3 = new Producto("Teclado", 75);

        tienda.agregarProductos(p1);
        tienda.agregarProductos(p2);
        tienda.agregarProductos(p3);

        Cliente c1 = new Cliente("Juan", "Pérez", "+34 639874125", "08290", "Carrer pepgomez 105");
        Cliente c2 = new Cliente("Ana", "López", "+34 697632541", "08290", "Carrer rosita 23");

        tienda.agregarCliente(c1);
        tienda.agregarCliente(c2);


        Pedido pedido1 = new Pedido(c1);
        pedido1.agregarLinea(new LineaProducto(p1, 1));
        pedido1.agregarLinea(new LineaProducto(p2, 2));


        Pedido pedido2 = new Pedido(c2);
        pedido2.agregarLinea(new LineaProducto(p3, 3));

        tienda.agregarPedido(pedido1);
        tienda.agregarPedido(pedido2);

        tienda.listaProductos();
        tienda.listaClientes();
        tienda.listaProductos();
    }
}