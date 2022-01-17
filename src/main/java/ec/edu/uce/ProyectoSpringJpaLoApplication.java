package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Carreras;
import ec.edu.uce.modelo.Carro;
import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Empleados;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Materia;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.ProductosRopa;
import ec.edu.uce.modelo.Profesor;
import ec.edu.uce.modelo.Radio;
import ec.edu.uce.modelo.Receta;
import ec.edu.uce.service.IAlmacenRopaService;
import ec.edu.uce.service.ICarrerasService;
import ec.edu.uce.service.ICarroService;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.IEmpleadosService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IMateriaService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IProductosRopaService;
import ec.edu.uce.service.IProfesorService;
import ec.edu.uce.service.IRadioService;

@SpringBootApplication
public class ProyectoSpringJpaLoApplication implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IAlmacenRopaService almacenService;
	@Autowired
	private ICarrerasService carrerasService;
	@Autowired
	private ICarroService carroService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IEmpleadosService empleadosService;
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private IProductosRopaService productosService;
	@Autowired
	private IProfesorService profesorService;
	@Autowired
	private IRadioService radioService;
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
//		Paciente p1 = this.pacienteService.busarPacientePorId(4);
//		System.out.println("el paciente que esta buscando es el 4");
//		System.out.println(p1);
//		Paciente p1 = new Paciente();
//		p1.setId(9);
//		p1.setNombre("constantine1");
//		p1.setApellido("constante");
//		p1.setEdad(45);
//		
//		Receta r1 = new Receta();
//		r1.setId(3);
//		r1.setIndicaciones("guardar reposos 5 semanas");
//		r1.setMedicamentos("paracetamol");
//		this.gestorService.registrarNuevaConsulta(p1, r1);
		//////////////////////////ALMACEN DE ROPA/////////////////////////////
//		AlmacenRopa alma = new AlmacenRopa();
//		alma.setId(10);
//		alma.setNombreAlmacen("suits and dresses");
//		alma.setNombrePropietario("luis ortiz");
//		alma.setRopa("vestidos y trajes");
//		alma.setPrecio(1000);
//		this.almacenService.insertarRopaNuevo(alma);
//////////////////////////CARRERAS/////////////////////////////
//		Carreras carrera = new Carreras();
//		carrera.setIdCarrera(10);
//		carrera.setNombreCarrera("MEDICINA");
//		carrera.setUniversidad("UCE");
//		carrera.setFacultad("CIENCIAS MEDICAS");
//		carrera.setCursosCarrera(20);
//		this.carrerasService.insertarCarrerasNuevo(carrera);
//////////////////////////CARRO/////////////////////////////
//		Carro carro = new Carro();
//		carro.setIdCarro(10);
//		carro.setNombrePropietario("roberth charpentier");
//		carro.setMarca("fiat");
//		carro.setPlaca("ibg 0045");
//		carro.setPrecioCarro(12000);
//		this.carroService.insertarCarroNuevo(carro);
//////////////////////////CLIENTE/////////////////////////////
//		Cliente cliente = new Cliente();
//		cliente.setIdCliente(9);
//		cliente.setNombre("CRISTIAN ZARACHO");
//		cliente.setEmail("CRISZA@gmail.com");
//		cliente.setCiudad("MANTA");
//		cliente.setTelefono("2979852");
//		this.clienteService.insertarClienteNuevo(cliente);
//////////////////////////EMPLEADOS/////////////////////////////
//		Empleados empleado = new Empleados();
//		empleado.setIdEmpleado(10);
//		empleado.setNombreEmpleado("karla cabrera");
//		empleado.setTiempoTrabajo("42 meses");
//		empleado.setDireccion("chillogallo");
//		empleado.setEmail("karcab@gmail.com");
//		this.empleadosService.insertarEmpleadosNuevo(empleado);
//////////////////////////ESTUDIANTE/////////////////////////////
//		Estudiante estudiante = new Estudiante();
//		estudiante.setIdEstudiante(10);
//		estudiante.setNombre("jessica");
//		estudiante.setApellido("alcocer");
//		estudiante.setCarrera("medicina");
//		estudiante.setEdad(20);
//		this.estudianteService.insertarEstudianteNuevo(estudiante);
//////////////////////////MATERIA/////////////////////////////
//		Materia materia = new Materia();
//		materia.setIdMateria(10);
//		materia.setMateria("analisis");
//		materia.setNombreProfesor("jorge lara");
//		materia.setHorasSemanales(6);
//		materia.setNumeroEstudiantes(39);
//		this.materiaService.insertarMateriaNuevo(materia);
//////////////////////////PRODUCTOS DE ROPA/////////////////////////////
//		ProductosRopa product = new ProductosRopa();
//		product.setIdProducto(9);
//		product.setNombreProducto("terno");
//		product.setPrecioRopa(300);
//		product.setColor("azul marino");
//		product.setTalla("L");
//		this.productosService.insertarProductosRopaNuevo(product);
//////////////////////////PROFESOR/////////////////////////////
//		Profesor prof = new Profesor();
//		prof.setIdProfesor(10);
//		prof.setNombre("luis");
//		prof.setApellido("utrillas");
//		prof.setEmailProfesor("lutri@gmail.com");
//		prof.setEdad(28);
//		this.profesorService.insertarProfesorNuevo(prof);
//////////////////////////RADIO/////////////////////////////
		Radio radio = new Radio();
		radio.setIdRadio(10);
		radio.setNombreRadio("la mega");
		radio.setNombreJefe("ariel mega");
		radio.setDireccion("gonzalez suarez");
		radio.setFrecuencia("103.3 FM");
		this.radioService.insertarRadioNuevo(radio);
		
	}

}