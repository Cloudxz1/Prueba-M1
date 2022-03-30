package pruebaM1;

public class Empresa {
	private String nombre;
	private String direccion;
	private String duenio_Empresa;
	private Mercado mercado;
	public Empresa(String nombre,String direccion,String duenio_Empresa,Mercado mercado){
		this.nombre= nombre;
		this.direccion= direccion;
		this.duenio_Empresa= duenio_Empresa;
		this.mercado = mercado;
	}
	public Mercado getMercado() {
		return mercado;
	}
	public void setMercado(Mercado mercado) {
		this.mercado = mercado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDuenio_Empresa() {
		return duenio_Empresa;
	}
	public void setDuenio_Empresa(String duenio_Empresa) {
		this.duenio_Empresa = duenio_Empresa;
	}
}
