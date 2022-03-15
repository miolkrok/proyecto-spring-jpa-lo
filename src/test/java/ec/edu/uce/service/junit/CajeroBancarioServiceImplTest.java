package ec.edu.uce.service.junit;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.service.deberes.ICuentaBancariaDService;
import ec.edu.uce.service.deberes.ICuentaHabienteService;

@Transactional
@Rollback(true)
@SpringBootTest
class CajeroBancarioServiceImplTest {
	
	@Autowired
	private ICuentaBancariaDService cuBcServ;
	
	@Autowired
	private ICuentaHabienteService cuHaServ;

	@Test
	void testConsultarCuenta() {
		assertEquals("GABRIEL", this.cuHaServ.buscarCuentaHabienteCedula("1754496463").getNombre());
	}

}
