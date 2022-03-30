package pruebaM1;
import java.util.ArrayList;

public class MenuPrincipal {

	public static void main(String[] args) {
		 /**
		  * Creacion de objetos cliente, producto, empresa, Mercado, pedido, venta
		  */
		Cliente c1 = new Cliente(1,"19968462-0","Vanesa","Av.Pedro Lobos #7514");
		Cliente c2 = new Cliente(2,"12345678-9","Karla","Av.Angamos #1234");
		Cliente c3 = new Cliente(3,"98765432-1","Karem","Pasaje Sarita Ortiz #10335");
		
		Mercado m1 = new Mercado(1,"Linces","Av.Brasil #1221","Los Leones");
		Empresa e1 = new Empresa("Makunga inc","Av.Los pajaritos #7777","Manuel Delgado",m1);
		
		Producto p1 = new Producto(1,"Papas Fritas","21-03-2022");
		Producto p2 = new Producto(2,"Sushi","21-03-2022");
	
		
		
		Pedido pedido = new Pedido(1,e1,new ArrayList<Producto>(),c1);
	
		Venta v1 = new Venta(1,20000,"27-03-2022","28-03-2022",c1,pedido,e1);
		v1.getPedido().getProductos().add(p1);
		v1.getPedido().getProductos().add(p2);
		
		String productos ="";
		for(int i= 0; i< pedido.getProductos().size(); i++) {
			productos = productos + v1.getPedido().getProductos().get(i).getNombre_producto() + ",";		
		}
		System.out.println("En la empresa " + v1.getEmpresa().getNombre() + " " + pedido.getCliente().getNombre_cliente() + " hizo un pedido de " + productos
				+ "en la fecha " + v1.getFecha_venta() + " y fue entregado el " + v1.getFecha_venta() + " y tuvo el costo de " + v1.getMonto());
	}

}
