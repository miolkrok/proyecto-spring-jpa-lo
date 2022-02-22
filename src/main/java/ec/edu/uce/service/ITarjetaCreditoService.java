package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoService {
	
	void insertarTarjetaCredito(TarjetaCredito tarjetaCredito);
	void actualizarTarjetaCredito(TarjetaCredito tarjetaCredito);
	TarjetaCredito buscarTarjetaCredito(Integer id);

}
