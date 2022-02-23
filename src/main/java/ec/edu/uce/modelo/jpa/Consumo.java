package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="consumo")
public class Consumo {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_consumo")
	@SequenceGenerator(name = "seq_consumo", sequenceName = "seq_consumo", allocationSize = 1)
	@Id
	@Column(name="cons_id")
	private Integer id;
	@Column(name="cons_valor_consumo")
	private BigDecimal valorConsumo;
	@Column(name="cons_fecha_consumo", columnDefinition = "TIMESTAMP")
	private LocalDateTime fechaConsumo;
	
	@ManyToOne
	@JoinColumn(name="tacr_id")
	private TarjetaCredito tarjetaCredito;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValorConsumo() {
		return valorConsumo;
	}

	public void setValorConsumo(BigDecimal valorConsumo) {
		this.valorConsumo = valorConsumo;
	}

	public LocalDateTime getFechaConsumo() {
		return fechaConsumo;
	}

	public void setFechaConsumo(LocalDateTime fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}

	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	@Override
	public String toString() {
		return "Consumo [id=" + id + ", valorConsumo=" + valorConsumo + ", fechaConsumo=" + fechaConsumo
				+ ", tarjetaCredito=" + tarjetaCredito + "]";
	}
	
	

	
	 

}
