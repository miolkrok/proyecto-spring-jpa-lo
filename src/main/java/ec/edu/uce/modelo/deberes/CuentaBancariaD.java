package ec.edu.uce.modelo.deberes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "cuenta_bancaria_d")
public class CuentaBancariaD {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuenta_bancaria_d")
	@SequenceGenerator(name = "seq_cuenta_bancaria_d", sequenceName = "seq_cuenta_bancaria_d", allocationSize = 1)
	@Id
	@Column(name="cuba_id")
	private Integer id;
	@Column(name="cuba_numero_cuenta")
	private String numeroCuenta;
	@Column(name="cuba_saldo")
	private BigDecimal saldo;
	@Column(name="cuba_tipo")
	private String tipo;
	@OneToMany(mappedBy = "cuentaBancaria",cascade=CascadeType.ALL)
	private List<HistoricoRetiros> retiHist;
	@ManyToOne
	@JoinColumn(name="cuha_id")
	private CuentaHabiente cuentaHabienteBanc;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public CuentaHabiente getCuentaHabienteBanc() {
		return cuentaHabienteBanc;
	}
	public void setCuentaHabienteBanc(CuentaHabiente cuentaHabienteBanc) {
		this.cuentaHabienteBanc = cuentaHabienteBanc;
	}
	public List<HistoricoRetiros> getRetiHist() {
		return retiHist;
	}
	public void setRetiHist(List<HistoricoRetiros> retiHist) {
		this.retiHist = retiHist;
	}
	@Override
	public String toString() {
		return "CuentaBancariaD [id=" + id + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipo=" + tipo
				+ ", cuentaHabienteBanc=" + cuentaHabienteBanc + ", retiHist=" + retiHist + "]";
	}


}
