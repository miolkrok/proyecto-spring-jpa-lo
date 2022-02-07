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
@Table(name="auto")
public class Auto {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_auto")
	@SequenceGenerator(name = "seq_auto", sequenceName = "seq_auto", allocationSize = 1)
	@Id
	@Column(name="auto_id")
	private Integer id;
	@Column(name="auto_propietario")
	private String propietario;
	@Column(name="auto_marca")
	private String marca;
	@OneToOne(mappedBy = "auto",cascade=CascadeType.ALL)
	private Matricula matricula;
	
	//SET y GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	

}
