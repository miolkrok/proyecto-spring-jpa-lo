package ec.edu.uce.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name= "turista")
public class Turista {
	
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_turista")
	@SequenceGenerator(name="seq_turista", sequenceName = "seq_turista",allocationSize = 1)
	@Id
	@Column(name = "turi_id")
	private Integer id;

	@Column(name = "turi_nombre")
	private String nombre;
	
	@Column(name = "turi_valor")
	private BigDecimal valor;
	
	@Column(name = "turi_abono")
	private BigDecimal abono;
	
	@Transient
	private BigDecimal saldo;
	
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getAbono() {
		return abono;
	}
	public void setAbono(BigDecimal abono) {
		this.abono = abono;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Turista [id=" + id + ", nombre=" + nombre + ", valor=" + valor + ", abono=" + abono + ", saldo=" + saldo
				+ "]";
	}
	
}
