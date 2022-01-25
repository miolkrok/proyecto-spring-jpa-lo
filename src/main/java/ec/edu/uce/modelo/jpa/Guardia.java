package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "guardia") // Es absoluyamente necesario cundo la tabla tiene un nombre diferente
//Declarar los query de Guardia
//@NamedQueries({
//		@NamedQuery(name = "Guardia.buscarPorApellido", query = "select g from Guardia g where g.apellido=: valor"),
//		@NamedQuery(name = "Guardia.buscarPorApellido1", query = "select g from Guardia g where g.apellido=: valor"),
//		@NamedQuery(name = "Guardia.buscarPorApellido2", query = "select g from Guardia g where g.apellido=: valor") })
@NamedQuery(name = "Guardia.buscarPorApellido", query = "select g from Guardia g where g.apellido=: valor")
public class Guardia {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_guardia1")
	@SequenceGenerator(name = "seq_guardia1", sequenceName = "seq_guardia1", allocationSize = 1)
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;//taller 21

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "edificio")
	private String edificio;

	// metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	@Override
	public String toString() {
		return "Guardia [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edificio=" + edificio + "]";
	}

}
