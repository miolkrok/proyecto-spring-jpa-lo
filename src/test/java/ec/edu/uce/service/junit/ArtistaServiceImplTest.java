package ec.edu.uce.service.junit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.uce.modelo.junit.Artista;


@SpringBootTest
class ArtistaServiceImplTest {

	@Autowired
	private IArtistaService artistaService;
	
	
	@Test
	void testGuardarArtista() {
//		fail("Not yet implemented");
		Artista ar = new Artista();
		
		ar.setId(1);
		ar.setApellido("Tapia");
		ar.setNombre("Deniis");
		ar.setPrecio(new BigDecimal(1000));
//		this.artistaService.modificarArtista(ar);
		assertThat(ar).isNotNull();
	}

	@Test
	void testModificarArtista() {
//		fail("Not yet implemented");
		assertThat(this.artistaService.buscar(1).getId()).isNotNull();
	}

	@Test
	void testBorrar() {
//		fail("Not yet implemented");
		assertNotEquals("Tapia", this.artistaService.buscarPorApellidoCriteriaApi("Ortiz"));
	}

	@Test
	void testBuscar() {
//		fail("Not yet implemented");
		//
		assertThat(this.artistaService.buscar(1).getPrecio()).isNotNull();
	}

	@Test
	void testBuscarPorApellido() {
		//fail("Not yet implemented");
		//assertThat(this.artistaService.buscarPorApellido("Tapia")).isNotEqualTo(this.artistaService.buscarPorApellido("Ortiz"));
	}

	@Test
	void testBuscarPorApellidoTyped() {
	//	fail("Not yet implemented");
		assertThat(this.artistaService.buscarPorApellidoTyped("Tapia")).isNotNull();
	}

	@Test
	void testBuscarPorApellidoNamed() {
		//fail("Not yet implemented");
		//assertThat(this.artistaService.buscarPorApellidoNamed("Tapia")).asList();
		System.out.println("AQUI ESTA");
		//System.out.println(this.artistaService.buscarPorApellidoNamed("Tapia").getId());
		assertThat(this.artistaService.buscarPorApellidoNamed("Tapia").getApellido()).isEqualTo("Tapia");
	}

	@Test
	void testBuscarPorApellidoNativeQuery() {
		//fail("Not yet implemented");
		assertThat(this.artistaService.buscarPorApellidoNativeQuery("Tapia")).isNotNull();
	}

	@Test
	void testBuscarPorApellidoCriteriaApi() {
	//	fail("Not yet implemented");

		//assertThat(this.artistaService.buscarPorApellidoCriteriaApi("Ortiz")).size().isGreaterThan(0);
		assertThat(this.artistaService.buscarPorApellidoCriteriaApi("Tapia")).asList();
	}

}
