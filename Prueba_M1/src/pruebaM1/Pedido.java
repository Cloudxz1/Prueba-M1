package pruebaM1;
import java.util.ArrayList;

public class Pedido {
	
	private int id_pedido;
	private Empresa empresa;
	private ArrayList<Producto>productos;
	private Cliente cliente;

	
	public Pedido(int id_pedido,Empresa empresa,ArrayList<Producto>productos,Cliente cliente) {
		this.id_pedido=id_pedido;
		this.empresa=empresa;
		this.productos=productos;
		this.cliente = cliente;
		
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
