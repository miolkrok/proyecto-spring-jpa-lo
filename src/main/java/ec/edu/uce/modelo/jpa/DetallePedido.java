package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

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
@Table(name="detalle_pedido")
public class DetallePedido {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_detalle_pedido")
	@SequenceGenerator(name = "seq_detalle_pedido", sequenceName = "seq_detalle_pedido", allocationSize = 1)
	@Id
	@Column(name="depe_id")
	private Integer id;
	
	@Column(name="depe_cantidad")
	private Integer cantidad;
	
	@Column(name="depe_precio")
	private BigDecimal precio;
	
	@ManyToOne
	@JoinColumn(name="pedi_id")
	private Pedido pedido;
	
	
	//SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "DetallePedido [id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", pedido=" + pedido + "]";
	}


	

}
