package ec.edu.uce.modelo.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "Clienteee")
public class Clienteee {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_clienteee")
	@SequenceGenerator(name = "seq_clienteee", sequenceName = "seq_clienteee", allocationSize = 1)
	@Id
	@Column(name="clie_id")
	private Integer id;
	@Column(name="clie_nombre")
	private String nombre;
	
	@ElementCollection
	private List<String> telefonos;
	
	//SET y GET
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
	public List<String> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(List<String> telefonos) {
		this.telefonos = telefonos;
	}
	
	
	

}
