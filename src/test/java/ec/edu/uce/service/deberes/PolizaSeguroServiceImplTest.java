package ec.edu.uce.service.deberes;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.isNotNull;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.deberes.PolizaSeguro;

@Rollback(true)
@Transactional
@SpringBootTest
class PolizaSeguroServiceImplTest {
	
	@Autowired
	private IPolizaSeguroService poliServ;

	@Test
	void testInsertarPolizaSeguro() {
		
		PolizaSeguro pol = new PolizaSeguro();
//		pol.setEstado("P");
		pol.setId(1);
		assertThat(pol).isNotNull();
	}

	@Test
	void testActualizarPolizaSeguro() {
		PolizaSeguro pol = new PolizaSeguro();
		pol.setId(1);
		pol.setEstado("N");
		this.poliServ.actualizarPolizaSeguro(pol);
		assertThat(pol.getEstado()).isEqualTo("N");
	}

	@Test
	void testBuscarPolizaSeguro() {
		assertEquals("P", this.poliServ.buscarPolizaSeguro(1).getEstado());
	}

	@Test
	void testBorrarPolizaSeguro() {
		PolizaSeguro pol = new PolizaSeguro();
		this.poliServ.borrarPolizaSeguro(1);
		assertThat(pol.getId()).isNull();
	}
	
	@Test
	void testInsertarPolizaSeguro1() {
		
		PolizaSeguro pol = new PolizaSeguro();
//		pol.setEstado("P");
		pol.setNumero("9492");;
		this.poliServ.insertarPolizaSeguro(pol);
		assertThat(pol.getNumero()).isEqualTo("9492");
	}

	@Test
	void testActualizarPolizaSeguro1() {
		PolizaSeguro pol = new PolizaSeguro();
		pol.setId(1);
		pol.setNumero("2425");
		this.poliServ.actualizarPolizaSeguro(pol);
		assertThat(pol.getNumero()).isEqualTo("2425");
	}

	@Test
	void testBuscarPolizaSeguro1() {
		assertEquals("1234", this.poliServ.buscarPolizaSeguro(1).getNumero());
	}

	@Test
	void testBorrarPolizaSeguro1() {
		PolizaSeguro pol = new PolizaSeguro();
		this.poliServ.borrarPolizaSeguro(1);
		assertThat(pol.getId()).isEqualTo(null);
		assertTrue(true);
	}

}
