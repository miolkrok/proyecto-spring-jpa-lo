package ec.edu.uce.modelo;

public class AlmacenRopa {

	private Integer id;
	private String nombreAlmacen;
	private String nombrePropietario;
	private String ropa;
	private Integer precio;
	
	
	//Metodos SET y GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreAlmacen() {
		return nombreAlmacen;
	}
	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public String getRopa() {
		return ropa;
	}
	public void setRopa(String ropa) {
		this.ropa = ropa;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	
	
}
