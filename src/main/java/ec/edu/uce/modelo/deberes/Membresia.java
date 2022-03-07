package ec.edu.uce.modelo.deberes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="membresia")
public class Membresia {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_membresia")
	@SequenceGenerator(name = "seq_membresia", sequenceName = "seq_membresia", allocationSize = 1)
	@Id
	@Column(name="memb_id")
	private Integer id;
	
	@Column(name="memb_codigo")
	private String codigo;
	
	@Column(name="memb_nombre")
	private String nombre;
	
	@Column(name="memb_valor")
	private BigDecimal valor;
	
	@Column(name="memb_vigencia")
	private String vigencia;
	
	@Column(name="memb_cantidad")
	private Integer cantidad;

	@OneToMany(mappedBy = "membresia",cascade=CascadeType.ALL)//De donde sale????
	private List<RegistroPago> registroPagoM;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public List<RegistroPago> getRegistroPagoM() {
		return registroPagoM;
	}

	public void setRegistroPagoM(List<RegistroPago> registroPagoM) {
		this.registroPagoM = registroPagoM;
	}

	@Override
	public String toString() {
		return "Membresia [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", valor=" + valor + ", vigencia="
				+ vigencia + ", cantidad=" + cantidad + ", registroPagoM=" + registroPagoM + "]";
	}


}
