package ec.edu.uce.modelo;

public class Profesor {
	
	private Integer idProfesor;
	private String nombre;
	private String apellido;
	private String emailProfesor;
	private Integer edad;
	//Metodos SET y GET
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmailProfesor() {
		return emailProfesor;
	}
	public void setEmailProfesor(String emailProfesor) {
		this.emailProfesor = emailProfesor;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", emailProfesor=" + emailProfesor + ", edad=" + edad + "]";
	}
	
}
