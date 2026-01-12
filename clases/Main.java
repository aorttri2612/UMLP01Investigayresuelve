package clases;

public class Main {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1);

		Producto teclado = new Producto("Teclado", 25.50);
		Producto raton = new Producto("Ratón", 15.00);

		pedido.agregarProducto(teclado);
		pedido.agregarProducto(raton);

		System.out.println("Número de pedido: " + pedido.getNumero());
		System.out.println("Estado del pedido: " + pedido.getEstado());
		System.out.println("Total del pedido: " + pedido.calcularTotal() + " €");

		pedido.setEstado(EstadoPedido.ENVIADO);

		System.out.println("Nuevo estado del pedido: " + pedido.getEstado());
	}
}
