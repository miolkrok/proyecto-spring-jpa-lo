package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.Receta;
import ec.edu.uce.service.IAlmacenRopaService;
import ec.edu.uce.service.ICarrerasService;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.IEmpleadosService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IGestorCitaService;
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
	@Autowired
	private IGestorCitaService gestorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaLoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Paciente paciente1 = new Paciente();
//		paciente1.setId(4);
//		paciente1.setNombre("benancio1");
//		paciente1.setApellido("cantera");
//		paciente1.setEdad(20);
//		
		//this.pacienteService.insertarPacienteNuevo(paciente1);
		//this.pacienteService.borrarPacientePorId(3);
		//this.pacienteService.actualizarPacienteNuevo(paciente1);
//		AlmacenRopa al = new AlmacenRopa();
//		al.setId(1);
//		al.setNombreAlmacen("juanix");
//		al.setNombrePropietario("ariela");
//		al.setRopa("camisetas");
//		al.setPrecio(10);
//		this.pacienteService1.insertarRopaNuevo(al);
//		Paciente p1 = this.pacienteService.busarPacientePorId(4);
//		System.out.println("el paciente que esta buscando es el 4");
//		System.out.println(p1);
		Paciente p1 = new Paciente();
		p1.setId(8);
		p1.setNombre("constantine");
		p1.setApellido("constante");
		p1.setEdad(45);
		
		Receta r1 = new Receta();
		r1.setId(2);
		r1.setIndicaciones("guardar reposos 5 semanas");
		r1.setMedicamentos("paracetamol");
		this.gestorService.registrarNuevaConsulta(p1, r1);
	}

}
