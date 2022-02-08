package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import ec.edu.uce.modelo.jpa.Actor;
import ec.edu.uce.modelo.jpa.Auto;
import ec.edu.uce.modelo.jpa.Boleto;
import ec.edu.uce.modelo.jpa.Cantante;
import ec.edu.uce.modelo.jpa.Celular;
import ec.edu.uce.modelo.jpa.Ciudadano;
import ec.edu.uce.modelo.jpa.Comediante;
import ec.edu.uce.modelo.jpa.DetalleFactura;
import ec.edu.uce.modelo.jpa.DetallePedido;
import ec.edu.uce.modelo.jpa.Empleado;
import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.modelo.jpa.Jugador;
import ec.edu.uce.modelo.jpa.Matricula;
import ec.edu.uce.modelo.jpa.Pasajero;
import ec.edu.uce.modelo.jpa.Pedido;
import ec.edu.uce.repository.jpa.GuardiaRepoImpl;
import ec.edu.uce.service.IActorService;
import ec.edu.uce.service.IAlmacenRopaService;
import ec.edu.uce.service.IAutoService;
import ec.edu.uce.service.ICantanteService;
import ec.edu.uce.service.ICarrerasService;
import ec.edu.uce.service.ICarroService;
import ec.edu.uce.service.ICelularService;
import ec.edu.uce.service.ICiudadanoService;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.IComedianteService;
import ec.edu.uce.service.IEmpleadosService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IFacturaService;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IGuardiaService;
import ec.edu.uce.service.IJugadorService;
import ec.edu.uce.service.IMateriaService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IPasajeroService;
import ec.edu.uce.service.IPedidoService;
import ec.edu.uce.service.IProductosRopaService;
import ec.edu.uce.service.IProfesorService;
import ec.edu.uce.service.IRadioService;

@SpringBootApplication
public class ProyectoSpringJpaLoApplication implements CommandLineRunner{
	private static final Logger LOG =  LoggerFactory.getLogger(ProyectoSpringJpaLoApplication.class);


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
	@Autowired
	private IGuardiaService guardiaService;
	////////////////////////JPA///////////////////////////
	@Autowired
	private IActorService actorService;
	@Autowired
	private ICantanteService cantanteService;
	@Autowired
	private ICelularService celularService;
	@Autowired
	private IComedianteService comedianteService;
	@Autowired
	private IJugadorService jugadorService;
	@Autowired
	private IFacturaService facturaService;
	@Autowired
	private IPedidoService pedidoService;
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IAutoService autoService;
	@Autowired
	private IPasajeroService pasajeroService;
//	
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
//	AlmacenRopa alma = new AlmacenRopa();
//		alma.setId(10);
//		alma.setNombreAlmacen("suits and dresses");
//		alma.setNombrePropietario("luis ortiz");
//		alma.setRopa("vestidos y trajes");
//		alma.setPrecio(1000);
//		this.almacenService.insertarRopaNuevo(alma);
		//////////nuevos metodos/////////
		//this.almacenService.borrarAlmacenRopaPorId(1);
//		alma.setId(2);
//		alma.setNombreAlmacen("suits and dresses10");
//		alma.setNombrePropietario("luis ortiz");
//		alma.setRopa("vestidos y trajes");
//		alma.setPrecio(1000);
//		this.almacenService.actualizarAlmacenRopaNuevo(alma);
		
//		AlmacenRopa a1 = this.almacenService.buscarAlmacenRopaPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(a1);
		
//////////////////////////CARRERAS/////////////////////////////
		Carreras carrera = new Carreras();
//		carrera.setIdCarrera(1);
//		carrera.setNombreCarrera("MEDICINA");
//		carrera.setUniversidad("UCE");
//		carrera.setFacultad("CIENCIAS MEDICAS");
//		carrera.setCursosCarrera(20);
//		this.carrerasService.insertarCarrerasNuevo(carrera);
//		this.carrerasService.borrarCarrerasPorId(1);
//		carrera.setIdCarrera(1);
//		carrera.setNombreCarrera("MEDICINA");
//		carrera.setUniversidad("UCE");
//		carrera.setFacultad("CIENCIAS MEDICAS");
//		carrera.setCursosCarrera(20);
//		this.carrerasService.actualizarCarrerasNuevo(carrera);
//		Carreras b1 = this.carrerasService.buscarCarrerasPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(b1);
//////////////////////////CARRO/////////////////////////////
		Carro carro = new Carro();
//		carro.setIdCarro(10);
//		carro.setNombrePropietario("roberth charpentier");
//		carro.setMarca("fiat");
//		carro.setPlaca("ibg 0045");
//		carro.setPrecioCarro(12000);
//		this.carroService.insertarCarroNuevo(carro);
//		this.carroService.borrarCarroPorId(1);
//		carro.setIdCarro(1);
//		carro.setNombrePropietario("roberth charpentier");
//		carro.setMarca("fiat");
//		carro.setPlaca("ibg 0045");
//		carro.setPrecioCarro(12000);
//		this.carroService.insertarCarroNuevo(carro);
//		this.carroService.actualizarCarroNuevo(carro);
//		Carro c1 = this.carroService.buscarCarroPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(c1);
//////////////////////////CLIENTE/////////////////////////////
		Cliente cliente = new Cliente();
//		cliente.setIdCliente(9);
//		cliente.setNombre("CRISTIAN ZARACHO");
//		cliente.setEmail("CRISZA@gmail.com");
//		cliente.setCiudad("MANTA");
//		cliente.setTelefono("2979852");
//		this.clienteService.insertarClienteNuevo(cliente);
//		this.clienteService.borrarClientePorId(1);
//		cliente.setIdCliente(4);
//		cliente.setNombre("CRISTIAN ZARACHO");
//		cliente.setEmail("CRISZA@gmail.com");
//		cliente.setCiudad("MANTA");
//		cliente.setTelefono("2979852");
//		this.clienteService.actualizarClienteNuevo(cliente);
//		Cliente d1 = this.clienteService.buscarClientePorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(d1);
//////////////////////////EMPLEADOS/////////////////////////////
		Empleados empleado = new Empleados();
//		empleado.setIdEmpleado(10);
//		empleado.setNombreEmpleado("karla cabrera");
//		empleado.setTiempoTrabajo("42 meses");
//		empleado.setDireccion("chillogallo");
//		empleado.setEmail("karcab@gmail.com");
//		this.empleadosService.insertarEmpleadosNuevo(empleado);
//		this.empleadosService.borrarEmpleadosPorId(1);
//		empleado.setIdEmpleado(4);
//		empleado.setNombreEmpleado("karla cabrera");
//		empleado.setTiempoTrabajo("42 meses");
//		empleado.setDireccion("chillogallo");
//		empleado.setEmail("karcab@gmail.com");
//		this.empleadosService.actualizarEmpleadosNuevo(empleado);
//		Empleados e1 = this.empleadosService.buscarEmpleadosPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(e1);
//////////////////////////ESTUDIANTE/////////////////////////////
		Estudiante estudiante = new Estudiante();
//		estudiante.setIdEstudiante(10);
//		estudiante.setNombre("jessica");
//		estudiante.setApellido("alcocer");
//		estudiante.setCarrera("medicina");
//		estudiante.setEdad(20);
//		this.estudianteService.insertarEstudianteNuevo(estudiante);
//		this.estudianteService.borrarEstudiantePorId(1);
//		estudiante.setIdEstudiante(4);
//		estudiante.setNombre("jessica");
//		estudiante.setApellido("alcocer");
//		estudiante.setCarrera("medicina");
//		estudiante.setEdad(20);
//		this.estudianteService.actualizarEstudianteNuevo(estudiante);
//		Estudiante f1 = this.estudianteService.buscarEstudiantePorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(f1);
//////////////////////////MATERIA/////////////////////////////
		Materia materia = new Materia();
//		materia.setIdMateria(10);
//		materia.setMateria("analisis");
//		materia.setNombreProfesor("jorge lara");
//		materia.setHorasSemanales(6);
//		materia.setNumeroEstudiantes(39);
//		this.materiaService.insertarMateriaNuevo(materia);
//		this.materiaService.borrarMateriaPorId(1);
//		
//		this.materiaService.actualizarMateriaNuevo(materia);
//		Materia g1 = this.materiaService.buscarMateriaPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(g1);
//////////////////////////PRODUCTOS DE ROPA/////////////////////////////
		ProductosRopa product = new ProductosRopa();
//		product.setIdProducto(9);
//		product.setNombreProducto("terno");
//		product.setPrecioRopa(300);
//		product.setColor("azul marino");
//		product.setTalla("L");
//		this.productosService.insertarProductosRopaNuevo(product);
//		this.productosService.borrarProductosRopaPorId(1);
//		product.setIdProducto(4);
//		product.setNombreProducto("terno");
//		product.setPrecioRopa(300);
//		product.setColor("azul marino");
//		product.setTalla("L");
//		this.productosService.actualizarProductosRopaNuevo(product);
//		ProductosRopa h1 = this.productosService.busarProductosRopaPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(h1);
//////////////////////////PROFESOR/////////////////////////////
		Profesor prof = new Profesor();
//		prof.setIdProfesor(10);
//		prof.setNombre("luis");
//		prof.setApellido("utrillas");
//		prof.setEmailProfesor("lutri@gmail.com");
//		prof.setEdad(28);
//		this.profesorService.insertarProfesorNuevo(prof);
//		this.profesorService.borrarProfesorPorId(1);
//		prof.setIdProfesor(4);
//		prof.setNombre("luis");
//		prof.setApellido("utrillas");
//		prof.setEmailProfesor("lutri@gmail.com");
//		prof.setEdad(28);
//		this.profesorService.actualizarProfesorNuevo(prof);
//		Profesor i1 = this.profesorService.busarProfesorPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(i1);
//////////////////////////RADIO/////////////////////////////
		Radio radio = new Radio();
//		radio.setIdRadio(10);
//		radio.setNombreRadio("la mega");
//		radio.setNombreJefe("ariel mega");
//		radio.setDireccion("gonzalez suarez");
//		radio.setFrecuencia("103.3 FM");
//		this.radioService.insertarRadioNuevo(radio);
//		this.radioService.borrarRadioPorId(1);
//		radio.setIdRadio(4);
//		radio.setNombreRadio("la mega");
//		radio.setNombreJefe("ariel mega");
//		radio.setDireccion("gonzalez suarez");
//		radio.setFrecuencia("103.3 FM");
//		this.radioService.actualizarRadioNuevo(radio);
//		Radio j1 = this.radioService.buscarRadioPorId(4);
//		System.out.println("el almacen que esta buscando es el 4");
//		System.out.println(j1);
//		////////////////////////////////////////////////JPA JPA/////////////////////////////////////////////////////
//		Guardia gua1 = new Guardia();
//		gua1.setNombre("consola");
//		gua1.setApellido("MVN");
//		gua1.setEdificio("CCNU");
//		this.guardiaService.guardar(gua1); 
//		Guardia g102 = this.guardiaService.buscar(102);
//		System.out.println(g102);
//		this.guardiaService.borrar(102);
//		
//		Guardia gApellido = this.guardiaService.buscarPorApellidoLista("torres");
//		System.out.println(gApellido);
//		Guardia gua2 = new Guardia();
//		gua2.setId(3);
//		gua2.setNombre("juanito");
//		gua2.setApellido("teran");
//		gua2.setEdificio("villaflora");
//		this.guardiaService.actualizar(gua2);
		//AQUI INSERTAMOS CON TYPED QUERY
//		Guardia gApellidoType = this.guardiaService.buscarPorApellidoTyped("MVN");
//		System.out.println(gApellidoType);
		//NAMED QUERY
//		Guardia gApellidonNamed = this.guardiaService.buscarPorApellidoNamed("MVN");
//		LOG.info("El guardia es: " + gApellidonNamed);
		///NATIVE QUERY
//		Guardia gApellidoNative = this.guardiaService.buscarPorApellidoNative("MVN");
//		LOG.info("El guardia es: " + gApellidoNative);
		//NAMED NATIVE QUERY
//		Guardia gApellidoNamedNative = this.guardiaService.buscarPorApellidoNamedNative("MVN");
//		LOG.info("El guardia es (NAMED SQL NATIVE): " + gApellidoNamedNative);
		//CRITERIA API
//		Guardia gApellidoCriteria = this.guardiaService.buscarPorApellidoCriteriaAPI("MVN");
//		LOG.info("El guardia es (CRITERIA): " + gApellidoCriteria);
		//CRITERIA API AND
//		Guardia gApellidoCriteriaAnd = this.guardiaService.buscarPorApellidoCriteriaAPIAnd("MVN","CCNU");
//		LOG.info("El guardia es (CRITERIA AND): " + gApellidoCriteriaAnd);
		//CRITERIA API OR
//		List<Guardia> listaGuardiaOr = this.guardiaService.buscarPorApellidoCriteriaAPIOr("MVN","villaflora");
//		for(Guardia g : listaGuardiaOr) {
//			LOG.info("El guardia es (CRITERIA OR): " + g);
//		}
		
	
		//////////////////////JPA ACTOR/////////////////////
//		Actor act = new Actor();
//		act.setNombre("bob saget");
//		act.setUltimaPelicula("fuller house");
//		this.actorService.guardar(act);
//		
//		Actor act1 = new Actor();
//		act.setId(1);
//		act1.setNombre("angelina jolie");
//		act1.setUltimaPelicula("eternals");
//		this.actorService.actualizar(act1);
//		Actor a8 = this.actorService.buscar(8);
//		System.out.println(a8);
//		this.actorService.borrar(9);
//		
//		Actor aNombre = this.actorService.buscarPorNombre("bob saget");
//		System.out.println(aNombre);
		//AQUI INSERTAMOS CON TYPED QUERY
//		Actor aNombreType = this.actorService.buscarPorNombreTyped("bob saget");
//		System.out.println(aNombreType);
//		//NAMED QUERY
//		Actor aNombreNamed = this.actorService.buscarPorNombreNamed("bob saget");
//		LOG.info("El guardia es: " + aNombreNamed);
//		Actor aNombreNative = this.actorService.buscarPorNombreNative("bob saget");
//		LOG.info("El Actor es: " + aNombreNative);
		//////////////////////JPA CANTANTE/////////////////////
//		Cantante cant = new Cantante();
//		cant.setNombre("juanes");
//		cant.setGeneroMusical("pop");
//		this.cantanteService.guardar(cant);
//		
//		Cantante cant1 = new Cantante();
//		cant1.setId(1);
//		cant1.setNombre("angelina jolie");
//		cant1.setGeneroMusical("pop");
//		this.cantanteService.actualizar(cant1);
//		Cantante c12 = this.cantanteService.buscar(12);
//		System.out.println(c12);
//		this.cantanteService.borrar(11);
//		
		
//		Cantante cNombre = this.cantanteService.buscarPorNombre("madonna");
//		System.out.println(cNombre);
		//AQUI INSERTAMOS CON TYPED QUERY
//		Cantante cNombreType = this.cantanteService.buscarPorNombreTyped("madonna");
//		System.out.println(cNombreType);
//		//NAMED QUERY
//		Cantante cNombreNamed = this.cantanteService.buscarPorNombreNamed("madonna");
//		LOG.info("El guardia es: " + cNombreNamed);
//		Cantante cNombreNative = this.cantanteService.buscarPorNombreNative("madonna");
//		LOG.info("El Cantante es: " + cNombreNative);
		//////////////////////JPA CELULAR/////////////////////
//		Celular cel = new Celular();
//		cel.setMarca("camaro");
//		cel.setPrecio(70000);
//		this.celularService.guardar(cel);
//		
//		Celular cel1 = new Celular();
//		cel1.setId(1);
//		cel1.setMarca("mazda");
//		cel1.setPrecio(50000);
//		this.celularService.actualizar(cel1);
//		Celular c12 = this.celularService.buscar(19);
//		System.out.println(c12);
//		this.celularService.borrar(18);
//		
//		Celular celMarca = this.celularService.buscarPorMarca("mazda");
//		System.out.println(celMarca);
		//AQUI INSERTAMOS CON TYPED QUERY
//		Celular celMarcaType = this.celularService.buscarPorMarcaTyped("mazda");
//		System.out.println(celMarcaType);
//		//NAMED QUERY
//		Celular gApellidonNamed = this.celularService.buscarPorMarcaNamed("mazda");
//		LOG.info("El guardia es: " + gApellidonNamed);
//		Celular celMarcaNative = this.celularService.buscarPorMarcaNative("mazda");
//		LOG.info("El Celular es: " + celMarcaNative);
//		//////////////////////JPA COMEDIANTE/////////////////////
//		Comediante com = new Comediante();
//		com.setNombre("escorpion");
//		com.setEdad(34);
		
//		this.comedianteService.guardar(com);
//		
//		Comediante com1 = new Comediante();
//		com1.setId(22);
//		com1.setNombre("platanito");
//		com1.setEdad(45);
//		this.comedianteService.actualizar(com1);
//		Comediante c23 = this.comedianteService.buscar(23);
//		System.out.println(c23);
//		this.comedianteService.borrar(23);
//		
//		Comediante coNombre = this.comedianteService.buscarPorNombre("xhocas");
//		System.out.println(coNombre);
		//AQUI INSERTAMOS CON TYPED QUERY
//		Comediante coNombreType = this.comedianteService.buscarPorNombreTyped("xhocas");
//		System.out.println(coNombreType);
//		//NAMED QUERY
//		Comediante coNombreNamed = this.comedianteService.buscarPorNombreNamed("xhocas");
//		LOG.info("El guardia es: " + coNombreNamed);
//		Comediante coNombreNative = this.comedianteService.buscarPorNombreNative("xhocas");
//		LOG.info("El Comediante es: " + coNombreNative);
//		//////////////////////JPA JUGADOR/////////////////////
//		Jugador jug = new Jugador();
//		jug.setNombre("leonel messi");
//		jug.setPosicion("extremo");
//		this.jugadorService.guardar(jug);
//		
//		Jugador jug1 = new Jugador();
//		jug1.setId(28);
//		jug1.setNombre("cristiano ronaldo");
//		jug1.setPosicion("delantero");
//		this.jugadorService.actualizar(jug1);
//		Jugador j31 = this.jugadorService.buscar(31);
//		System.out.println(j31);
//		this.jugadorService.borrar(29);
//		
//		Jugador juNombre = this.jugadorService.buscarPorNombre("cristiano ronaldo");
//		System.out.println(juNombre);
		//AQUI INSERTAMOS CON TYPED QUERY
//		Jugador juNombreType = this.jugadorService.buscarPorNombreTyped("cristiano ronaldo");
//		System.out.println(juNombreType);
//		//NAMED QUERY
//		Jugador juNombreNamed = this.jugadorService.buscarPorNombreNamed("cristiano ronaldo");
//		LOG.info("El guardia es: " + juNombreNamed);
//		Jugador juNombreNative = this.jugadorService.buscarPorNombreNative("cristiano ronaldo");
//		LOG.info("El Jugador es: " + juNombreNative);
//		//////////////////////FACTURA/////////////////////

//
//		Factura miFactura = new Factura();
//		miFactura.setCedula("1718496944");
//		LocalDateTime miFecha = LocalDateTime.of(1989, Month.AUGUST,8,12,45);
//		miFactura.setNumero("2502-1254-1352-9743");
//		miFactura.setFecha(miFecha);
//		
//		
//		//vamos a construir la lista de detalles
//		List<DetalleFactura> detalles = new ArrayList<>();
//		
//		//primer detalle
//		DetalleFactura d1 = new DetalleFactura();
//		d1.setCantidad(2);
//		d1.setPrecio(new BigDecimal(2.57));
//		d1.setFactura(miFactura);
//		//segundo detalle
//		DetalleFactura d2 = new DetalleFactura();
//		d2.setCantidad(3);
//		d2.setPrecio(new BigDecimal(10.50));
//		d2.setFactura(miFactura);
//		
//		detalles.add(d1);
//		detalles.add(d2);
//		
//		miFactura.setDetallesd(detalles);
//		
//		
//		this.facturaService.guardarFactura(miFactura);
		
		List<Factura> listaFactura = this.facturaService.buscarPorFechaJOIN(LocalDateTime.of(1989, Month.AUGUST,8,12,45));
		LOG.info("La fecha es: " + listaFactura.size());
		for(Factura f : listaFactura) {
			LOG.info("La fecha es: " + f);
		}
		List<Factura> listaFacturaleft = this.facturaService.buscarPorFechaJOINLEFT(LocalDateTime.of(1989, Month.AUGUST,8,12,45));
		LOG.info("La fecha es: " + listaFacturaleft.size());
		for(Factura f : listaFacturaleft) {
			LOG.info("La fecha es: " + f);
		}
		List<Factura> listaFacturaWHERE = this.facturaService.buscarPorFechaWHERE(LocalDateTime.of(1989, Month.AUGUST,8,12,45));
		LOG.info("La fecha es: " + listaFacturaWHERE.size());
		for(Factura f : listaFacturaWHERE) {
			LOG.info("La fecha es: " + f);
		}
		
		
//		//////////////////////PEDIDO/////////////////////

//
//		Pedido miPedido = new Pedido();
//		miPedido.setCedula("1718496944");
//		LocalDateTime miFechaPedido = LocalDateTime.of(1989, Month.AUGUST,8,12,45);
//		miPedido.setNumero("2502-1254-1352-9743");
//		miPedido.setFecha(miFechaPedido);
//		
//		
//		//vamos a construir la lista de detalles
//		List<DetallePedido> detallesPedido = new ArrayList<>();
//		
//		//primer detalle
//		DetallePedido ped1 = new DetallePedido();
//		ped1.setCantidad(2);
//		ped1.setPrecio(new BigDecimal(2.57));
//		ped1.setPedido(miPedido);
//		//segundo detalle
//		DetallePedido ped2 = new DetallePedido();
//		ped2.setCantidad(3);
//		ped2.setPrecio(new BigDecimal(10.50));
//		ped2.setPedido(miPedido);
//		
//		detallesPedido.add(ped1);
//		detallesPedido.add(ped2);
//		
//		
//		miPedido.setDetallesPed(detallesPedido);
//		
//		
//		this.pedidoService.guardarPedido(miPedido);
//		//////////////////////PEDIDO/////////////////////
//
//		Ciudadano miCiudadano = new Ciudadano();
//		miCiudadano.setNombre("luis");
//		miCiudadano.setApellido("ortiz");
//		
//		//primer detalle
//		Empleado empl1 = new Empleado();
//		empl1.setIess("10asad4");
//		empl1.setSalario(new BigDecimal(10.50));
//		empl1.setCiudadano(miCiudadano);
//		
//		
//		
//		miCiudadano.setEmpleado(empl1);
//	
//		this.ciudadanoService.guardarCiudadano(miCiudadano);
		
//		//////////////////////AUTO/////////////////////

//		Auto miAuto = new Auto();
//		miAuto.setPropietario("luis ortiz"); 
//		miAuto.setMarca("tesla");
//		
//		//primer detalle
//		Matricula matr = new Matricula();
//		matr.setChasis("1849-9786-3565-8463");
//		matr.setCosto(new BigDecimal(400.50));
//		matr.setAuto(miAuto);
//		
//		
//		
//		miAuto.setMatricula(matr);
//	
//		this.autoService.guardarAuto(miAuto);
	
//	//////////////////////PASAJERO/////////////////////

//	Pasajero miPasajero = new Pasajero();
//	miPasajero.setNombre("luis ortiz"); 
//	miPasajero.setCedula("1718496944");
//	
//	//primer detalle
//	Boleto bole = new Boleto();
//	bole.setAsiento("38A");
//	bole.setPrecio(new BigDecimal(2500.50));
//	bole.setDestino("QATAR");
//	bole.setPasajero(miPasajero);
//	
//	
//	
//	miPasajero.setBoleto(bole);
//
//	this.pasajeroService.guardarPasajero(miPasajero);
}

}
