package ec.edu.uce.service.deberes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@Transactional
@Rollback(true)
@SpringBootTest
class CajeroBancarioServiceImplTestJUnit {
	
	@Autowired
	private ICuentaBancariaDService cuBcServ;
	
	@Autowired
	private ICuentaHabienteService cuHaServ;
	
	@Autowired
	private ICajeroBancarioService cajServ;

	@Test
	void testConsultarCuenta() {
		
		assertEquals("GABRIEL", this.cuHaServ.buscarCuentaHabienteCedula("1754496463").getNombre());
	}

	@Test
	void testRetirarDinero() {
		
		this.cajServ.retirarDinero("031495269554", new BigDecimal(100));
		assertEquals(new BigDecimal("2450.00"), this.cuBcServ.buscarCuentaBancariaDNum("031495269554").getSaldo());
	}

	@Test
	void testConsultarSaldoCuentaBancaria() {
		assertEquals("DANIELA", this.cuHaServ.buscarCuentaHabienteCedula("1749694977").getNombre());
	}



}
