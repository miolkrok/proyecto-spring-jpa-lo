package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoRepo {
	
	void insertarTarjetaCredito(TarjetaCredito tarjetaCredito);
	void actualizarTarjetaCredito(TarjetaCredito tarjetaCredito);
	TarjetaCredito BuscarPorId(Integer id);
	

}
