package pruebaM1;

public class Producto {
	
	private int id_producto;
	private String nombre_producto;
	private String fecha_elaboracion;
	
	public Producto(int id_producto,String nombre_producto,String fecha_elaboracion) {
		this.id_producto=id_producto;
		this.nombre_producto=nombre_producto;
		this.fecha_elaboracion=fecha_elaboracion;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getFecha_elaboracion() {
		return fecha_elaboracion;
	}
	public void setFecha_elaboracion(String fecha_elaboracion) {
		this.fecha_elaboracion = fecha_elaboracion;
	}
}
