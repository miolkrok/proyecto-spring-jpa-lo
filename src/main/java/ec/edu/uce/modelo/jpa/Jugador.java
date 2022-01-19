package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "jugador")
public class Jugador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_jugador7")
	@SequenceGenerator(name="seq_jugador7", sequenceName = "seq_jugador7",allocationSize = 1)
	@Column(name= "id")
	private Integer id;
	@Column(name= "nombre")
	private String nombre;
	@Column(name= "posicion")
	private String posicion;
	//metodos set y get
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
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", posicion=" + posicion + "]";
	}
	

}
