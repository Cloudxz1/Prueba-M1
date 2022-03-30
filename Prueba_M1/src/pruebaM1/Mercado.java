package pruebaM1;

public class Mercado {
	private int id_mercado;
	private String nombre_mercado;
	private String direccion;
	private String comuna;
	
	public Mercado(int id_mercado,String nombre_mercado,String direccion,String comuna) {
		this.id_mercado=id_mercado;
		this.nombre_mercado=nombre_mercado;
		this.direccion=direccion;
		this.comuna=comuna;
	}

	public int getId_mercado() {
		return id_mercado;
	}
	public void setId_mercado(int id_mercado) {
		this.id_mercado = id_mercado;
	}
	public String getNombre_mercado() {
		return nombre_mercado;
	}
	public void setNombre_mercado(String nombre_mercado) {
		this.nombre_mercado = nombre_mercado;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
}
