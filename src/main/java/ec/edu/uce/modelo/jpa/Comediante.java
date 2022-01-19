package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "comediante")
public class Comediante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comediante7")
	@SequenceGenerator(name="seq_comediante7", sequenceName = "seq_comediante7",allocationSize = 1)
	@Column(name= "id")
	private Integer id;
	@Column(name= "nombre")
	private String nombre;
	@Column(name= "edad")
	private Integer edad;
	
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

	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Comediante [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}