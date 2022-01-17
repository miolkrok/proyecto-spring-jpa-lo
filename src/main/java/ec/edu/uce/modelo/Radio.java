package ec.edu.uce.modelo;

public class Radio {
	
	private Integer idRadio;
	private String nombreRadio;
	private String nombreJefe;
	private String direccion;
	private String frecuencia;
	//Metodos SET y GET
	public Integer getIdRadio() {
		return idRadio;
	}
	public void setIdRadio(Integer idRadio) {
		this.idRadio = idRadio;
	}
	public String getNombreRadio() {
		return nombreRadio;
	}
	public void setNombreRadio(String nombreRadio) {
		this.nombreRadio = nombreRadio;
	}
	public String getNombreJefe() {
		return nombreJefe;
	}
	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	@Override
	public String toString() {
		return "Radio [idRadio=" + idRadio + ", nombreRadio=" + nombreRadio + ", nombreJefe=" + nombreJefe
				+ ", direccion=" + direccion + ", frecuencia=" + frecuencia + "]";
	}

}
