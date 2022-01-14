package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IAlmacenRopaService;
import ec.edu.uce.service.ICarrerasService;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.IEmpleadosService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IMateriaService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IProductosRopaService;
import ec.edu.uce.service.IRadioService;

@SpringBootApplication
public class ProyectoSpringJpaLoApplication implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IAlmacenRopaService pacienteService1;
	@Autowired
	private ICarrerasService pacienteService2;
	@Autowired
	private ICarrerasService pacienteService3;
	@Autowired
	private IClienteService pacienteService4;
	@Autowired
	private IEmpleadosService pacienteService5;
	@Autowired
	private IEstudianteService pacienteService6;
	@Autowired
	private IMateriaService pacienteService7;
	@Autowired
	private IProductosRopaService pacienteService8;
	@Autowired
	private IRadioService pacienteService9;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaLoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Paciente paciente1 = new Paciente();
//		paciente1.setId(3);
//		paciente1.setNombre("pepito");
//		paciente1.setApellido("teran");
//		paciente1.setEdad(14);
//		
//		this.pacienteService.insertarPacienteNuevo(paciente1);
		AlmacenRopa al = new AlmacenRopa();
		al.setId(2);
		al.setNombreAlmacen("juanix");
		al.setNombrePropietario("ariela");
		al.setRopa("camisetas");
		al.setPrecio(10);
		this.pacienteService1.insertarRopaNuevo(al);
		
	}

}
