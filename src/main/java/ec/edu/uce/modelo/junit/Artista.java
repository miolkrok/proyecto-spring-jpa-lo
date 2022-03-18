package ec.edu.uce.modelo.junit;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "artista")
////Declaracion Named
@NamedQuery(name = "Artista.buscarPorApellido", query = "select a from Artista a where a.apellido = :valor")

public class Artista {

	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_artista"))
	@SequenceGenerator(name = "seq_artista", sequenceName = "seq_artista",allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "precio")
	private BigDecimal precio;

	// metodos set y get
	
	
	
	public Integer getId() {
		return id;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
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

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
