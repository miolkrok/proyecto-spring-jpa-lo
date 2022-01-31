package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "celular")
@NamedQuery(name = "Celular.buscarPorMarca", query = "select g from Celular g where g.marca=: valor")
@NamedNativeQuery(name="Celular.buscarPorMarcaNamedNative",query="select * from Celular g where g.marca=:valor", resultClass = Celular.class)
public class Celular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_celular")
	@SequenceGenerator(name="seq_celular", sequenceName = "seq_celular",allocationSize = 1)
	@Column(name= "id")
	private Integer id;
	@Column(name= "marca")
	private String marca;
	@Column(name= "precio")
	private Integer precio;
	//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Celular [id=" + id + ", marca=" + marca + ", precio=" + precio + "]";
	} 

}
