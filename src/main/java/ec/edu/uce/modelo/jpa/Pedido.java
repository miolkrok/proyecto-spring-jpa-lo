package ec.edu.uce.modelo.jpa;

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
@Table(name="pedido")
public class Pedido {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedido")
	@SequenceGenerator(name = "seq_pedido", sequenceName = "seq_pedido", allocationSize = 1)
	@Id
	@Column(name="pedi_id")
	private Integer id;
	
	@Column(name="pedi_numero")
	private String numero;
	
	@Column(name="pedi_cedula")
	private String cedula;

	@Column(name="pedi_fecha", columnDefinition = "TIMESTAMP")
	private LocalDateTime fecha;
	
	//como represento que la factura puede tener muchos detalles
	@OneToMany(mappedBy = "pedido",cascade=CascadeType.ALL)//De donde sale????
	private List<DetallePedido> detallesPed;
	
	//SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public List<DetallePedido> getDetallesPed() {
		return detallesPed;
	}

	public void setDetallesPed(List<DetallePedido> detallesPed) {
		this.detallesPed = detallesPed;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", numero=" + numero + ", cedula=" + cedula + ", fecha=" + fecha + ", detallesPed="
				+ detallesPed + "]";
	}



	

}
