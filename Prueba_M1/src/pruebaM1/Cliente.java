package pruebaM1;

public class Cliente {

	private int id_cliente;
	private String rut;
	private String nombre_cliente;
	private String direccion_cliente;
	
	public Cliente(int id_cliente,String rut,String nombre_cliente,String direccion_cliente) {
		this.id_cliente=id_cliente;
		this.rut=rut;
		this.nombre_cliente=nombre_cliente;
		this.direccion_cliente=direccion_cliente;
		
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}
}
