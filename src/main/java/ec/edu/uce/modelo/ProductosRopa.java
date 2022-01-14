package ec.edu.uce.modelo;

public class ProductosRopa {
	
	private Integer idProducto;
	private String nombreProducto;
	private Integer precioRopa;
	private String color;
	private String talla;
	
	//Metodos SET y GET
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getPrecioRopa() {
		return precioRopa;
	}
	public void setPrecioRopa(Integer precioRopa) {
		this.precioRopa = precioRopa;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}

	
}
