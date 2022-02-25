package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.modelo.jpa.TarjetaCredito;
@Service
public class GestorTransaccionServiceImpl implements IGestorTransaccionService{

	@Autowired
	private ITarjetaCreditoService tarjetaService;
	@Autowired
	private IConsumoService consumoService;
	
	@Override
	@Transactional
	public void realizarTransaccion(TarjetaCredito tarjetaCredito, BigDecimal valorConsumo) {
		// TODO Auto-generated method stub
        TarjetaCredito tarjeta = this.tarjetaService.buscarTarjetaCredito(tarjetaCredito.getId());

        Consumo consumo = new Consumo();
        consumo.setValorConsumo(valorConsumo);
        consumo.setFechaConsumo(LocalDateTime.now());
        consumo.setTarjetaCredito(tarjeta);

        this.consumoService.insertarConsumo(consumo);

        tarjeta.setCupo(tarjeta.getCupo().subtract(valorConsumo));
        tarjeta.getDetConsumo().add(consumo);

        this.tarjetaService.actualizarTarjetaCredito(tarjeta);
	}
	

}
