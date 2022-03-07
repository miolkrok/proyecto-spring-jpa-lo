package ec.edu.uce.service.deberes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.Cliente;
import ec.edu.uce.modelo.deberes.FacturaElectronica;
import ec.edu.uce.modelo.deberes.Membresia;
import ec.edu.uce.modelo.deberes.RegistroPago;
import ec.edu.uce.repository.deberes.MembresiaRepoImpl;


@Service
public class GestorGimnasioServiceImpl implements IGestorGimnasioService{
	
	private static final Logger LOG =  LoggerFactory.getLogger(GestorGimnasioServiceImpl.class);
	
	@Autowired
	private IClienteService clienteServ;
	
	@Autowired
	private IFacturaElectronicaService factElectServ;
	
	@Autowired
	private IMembresiaService membServ;
	
	@Autowired
	private IRegistroPagoService regPagoServ;

	@Override
	@Transactional
	public void pagarMembresia(String cedula, String codigo) {
		// TODO Auto-generated method stub
	
			
		
		Membresia memb = this.membServ.buscarMembresia(codigo);
		Cliente cG = this.clienteServ.buscarClientePorCedula(cedula);
		cG.setEstado("P");
		this.clienteServ.actualizarCliente(cG);
		memb.setCantidad(memb.getCantidad() + 1);
		this.membServ.actualizarMembresia(memb);
		
		RegistroPago regPago = new RegistroPago();
		regPago.setFechaPago(LocalDateTime.now());
		regPago.setValorPago(new BigDecimal(29.99));
		regPago.setMembresia(this.membServ.buscarMembresia(codigo));
		regPago.setCliente(this.clienteServ.buscarClientePorCedula(cedula));
		
		this.regPagoServ.insertarRegistroPago(regPago);
		
		FacturaElectronica factElec = new FacturaElectronica();
		factElec.setCedulaCliente(cedula);
		factElec.setFechaPago(LocalDateTime.now());
		factElec.setValorPago(memb.getValor());
		this.factElectServ.insertarFacturaElectronica(factElec);
		LOG.info("llego 1");
		
		
		

		
		
		
		
		
		
	}
	


}
