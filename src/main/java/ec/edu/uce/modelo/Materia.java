package ec.edu.uce.modelo;

public class Materia {
	
	private Integer idMateria;
	private String materia;
	private String nombreProfesor;
	private Integer horasSemanales;
	private Integer numeroEstudiantes;
	//Metodos SET y GET
	public Integer getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	public Integer getHorasSemanales() {
		return horasSemanales;
	}
	public void setHorasSemanales(Integer horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}
	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	@Override
	public String toString() {
		return "Materia [idMateria=" + idMateria + ", materia=" + materia + ", nombreProfesor=" + nombreProfesor
				+ ", horasSemanales=" + horasSemanales + ", numeroEstudiantes=" + numeroEstudiantes + "]";
	}


}
