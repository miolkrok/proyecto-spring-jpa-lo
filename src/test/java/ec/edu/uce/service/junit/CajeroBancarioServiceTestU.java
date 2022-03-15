package ec.edu.uce.service.junit;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.deberes.CuentaHabiente;
import ec.edu.uce.service.deberes.ICuentaBancariaDService;
import ec.edu.uce.service.deberes.ICuentaHabienteService;

@Transactional
@Rollback(true)
@SpringBootTest
class CajeroBancarioServiceTestU {
	
	@Autowired
	private ICuentaBancariaDService cuBcServ;
	
	@Autowired
	private ICuentaHabienteService cuHaServ;
	
	

	@Test
	void testConsultarSaldoCuentaBancaria() {
		
		assertEquals("DANIELA", this.cuHaServ.buscarCuentaHabienteCedula("1749694977").getNombre());
	}

}
