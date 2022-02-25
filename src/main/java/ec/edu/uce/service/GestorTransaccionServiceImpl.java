package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.modelo.jpa.TarjetaCredito;


@Service
public class GestorTransaccionServiceImpl implements IGestorTransaccionService{
	
	private static final Logger LOG =  LoggerFactory.getLogger(GestorTransaccionServiceImpl.class);

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


        tarjeta.setCupo(tarjeta.getCupo().subtract(valorConsumo));
        tarjeta.getDetConsumo().add(consumo);
        
        LOG.info("AA1");
        this.consumoService.insertarConsumo(consumo);
		LOG.info("DA1");
		LOG.info("AA2");
		try {
        this.tarjetaService.actualizarTarjetaCredito(tarjeta);
		}catch(ArrayIndexOutOfBoundsException e) {
			LOG.error("ERROR");
		}
		LOG.info("DA2");
	}
	

}
