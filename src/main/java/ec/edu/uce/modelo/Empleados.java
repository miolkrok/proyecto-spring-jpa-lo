package ec.edu.uce.modelo;

public class Empleados {
	
	private Integer idEmpleado;
	private String nombreEmpleado;
	private String tiempoTrabajo;
	private String direccion;
	private String email;
	
	//Metodos SET y GET
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getTiempoTrabajo() {
		return tiempoTrabajo;
	}
	public void setTiempoTrabajo(String tiempoTrabajo) {
		this.tiempoTrabajo = tiempoTrabajo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Empleados [idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", tiempoTrabajo="
				+ tiempoTrabajo + ", direccion=" + direccion + ", email=" + email + "]";
	}

}
