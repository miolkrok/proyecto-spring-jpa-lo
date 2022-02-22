package ec.edu.uce.service;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface IGestorTransaccionService {
	void realizarTransaccion(TarjetaCredito tarjetaCredito,BigDecimal valorConsumo);
	

}
