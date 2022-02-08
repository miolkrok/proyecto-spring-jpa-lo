package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="boleto")
public class Boleto {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_boleto")
	@SequenceGenerator(name = "seq_boleto", sequenceName = "seq_boleto", allocationSize = 1)
	@Id
	@Column(name="bole_id")
	private Integer id;
	@Column(name="bole_asiento")
	private String asiento;
	@Column(name="bole_precio")
	private BigDecimal precio;
	@Column(name="bole_destino")
	private String destino;
	
	@OneToOne
	@JoinColumn(name = "bole_id_pasajero")
	private Pasajero pasajero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public String toString() {
		return "Boleto [id=" + id + ", asiento=" + asiento + ", precio=" + precio + ", destino=" + destino
				+ ", pasajero=" + pasajero + "]";
	}
	
	

}
