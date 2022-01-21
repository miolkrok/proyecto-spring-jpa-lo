package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "actor")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_actor")
	@SequenceGenerator(name="seq_actor", sequenceName = "seq_actor",allocationSize = 1)
	@Column(name= "id")
	private Integer id;
	@Column(name= "nombre")
	private String nombre;
	@Column(name= "ultimapelicula")
	private String ultimaPelicula;
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
	public String getUltimaPelicula() {
		return ultimaPelicula;
	}
	public void setUltimaPelicula(String ultimaPelicula) {
		this.ultimaPelicula = ultimaPelicula;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", nombre=" + nombre + ", ultimaPelicula=" + ultimaPelicula + "]";
	}
	

}
