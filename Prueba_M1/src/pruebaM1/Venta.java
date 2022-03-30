package pruebaM1;

public class Venta {
	
	private int id_Venta;
	private int monto;
	private String fecha_venta;
	private String fecha_entrega;
	private Cliente cliente;
	private Pedido pedido;
	private Empresa empresa;
	public Venta(int id_Venta,int monto,String fecha_venta,String fecha_entrega,Cliente cliente, Pedido pedido, Empresa empresa) {
		this.id_Venta=id_Venta;
		this.monto=monto;
		this.fecha_venta=fecha_venta;
		this.fecha_entrega=fecha_entrega;
		this.cliente=cliente;
		this.pedido = pedido;
		this.empresa=empresa;
	
	}
	public int getId_Venta() {
		return id_Venta;
	}
	public void setId_Venta(int id_Venta) {
		this.id_Venta = id_Venta;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public String getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	public String getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
