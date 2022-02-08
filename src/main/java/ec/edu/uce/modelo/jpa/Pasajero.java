package ec.edu.uce.modelo.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pasajero")
public class Pasajero {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pasajero")
	@SequenceGenerator(name = "seq_pasajero", sequenceName = "seq_pasajero", allocationSize = 1)
	@Id
	@Column(name="pasa_id")
	private Integer id;
	@Column(name="pasa_nombre")
	private String nombre;
	@Column(name="pasa_cedula")
	private String cedula;
	@OneToOne(mappedBy = "pasajero",cascade=CascadeType.ALL)
	private Boleto boleto;
	
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Boleto getBoleto() {
		return boleto;
	}
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + "]";
	}


}
