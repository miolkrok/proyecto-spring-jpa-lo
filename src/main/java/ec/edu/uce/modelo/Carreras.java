package ec.edu.uce.modelo;

public class Carreras {
	
	private Integer idCarrera;
	private String nombreCarrera;
	private String universidad;
	private String facultad;
	private Integer cursosCarrera;
	
	//Metodos SET y GET
	public Integer getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(Integer idCarrera) {
		this.idCarrera = idCarrera;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public Integer getCursosCarrera() {
		return cursosCarrera;
	}
	public void setCursosCarrera(Integer cursosCarrera) {
		this.cursosCarrera = cursosCarrera;
	}

}
