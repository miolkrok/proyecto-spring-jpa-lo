package ec.edu.uce.repository.jpa;


import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.Factura;

public interface IFacturaRepo {
	
	void insertarFactura(Factura factura);
	//void actualizarFactura(Factura factura);
	//Factura buscarActorPorId(Integer id);
	//void borrarActorPorId(Integer id);

	List<Factura> buscarPorFechaJOIN(LocalDateTime fecha);
	List<Factura> buscarPorFechaJOINLEFT(LocalDateTime fecha);
	List<Factura> buscarPorFechaWHERE(LocalDateTime fecha);
}
