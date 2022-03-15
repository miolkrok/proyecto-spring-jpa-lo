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
class CajeroBancarioServiceImplTestD {
	
	@Autowired
	private ICuentaBancariaDService cuBcServ;
	
	@Autowired
	private ICuentaHabienteService cuHaServ;

	@Test
	void testRetirarDinero() {
		assertEquals(new BigDecimal("2550.00"), this.cuBcServ.buscarCuentaBancariaDNum("031495269554").getSaldo());
	}

}
