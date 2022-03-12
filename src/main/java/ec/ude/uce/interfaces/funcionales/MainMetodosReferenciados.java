package ec.ude.uce.interfaces.funcionales;

import java.util.ArrayList;
import java.util.List;

public class MainMetodosReferenciados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Implementar por clases
		IPersonaSupplier<String> persona = new PersonaSupplierImpl();
		String mensaje = persona.get();
		System.out.println(mensaje);
//		List<Integer> lista = new ArrayList<>();
		
		//2. Implementar por lambdas 
		IPersonaSupplier<String> persona1 = () -> "Se implemento por lambda";
		String mensaje1 = persona1.get();
		System.out.println(mensaje1);
		
		//3. Implementar por lambdas
		PersonaSupplierImpl personaImpl = new PersonaSupplierImpl();
		IPersonaSupplier<String> persona2 = personaImpl::get;
		String mensaje2 = persona2.get();
		System.out.println(mensaje2);
		
		//3.1
		PersonSupplierSinImpl personaSinImpl = new PersonSupplierSinImpl();
		
		IPersonaSupplier<String> persona3 = personaSinImpl::get2;
		String mensaje3 = persona3.get();
		System.out.println(mensaje3);
		
		PersonSupplierSinImpl personaSinImpl1 = new PersonSupplierSinImpl();
		
		IPersonaSupplier<Integer> persona4 = personaSinImpl1::get3;
		Integer mensaje4 = persona4.get();
		System.out.println(mensaje4);
		
		//PREDICATE
		//3.2
		PersonaPredicateImpl personaPredi = new PersonaPredicateImpl();
		
		IPersonaPredicate<String> personaP1 = personaPredi::evaluar;
		
		boolean nombre = personaP1.evaluar("Mensaje");
		System.out.println(nombre);
		
		IPersonaPredicate<String> personaP2 = valor1 -> valor1.contains("Z");
		boolean respuesta = personaP2.evaluar("ARROZ");
		prueba(personaPredi::evaluar);
		
		
	}
	public static boolean prueba(IPersonaPredicate<String> arg1) {
		return arg1.evaluar("Mensaje");
		
	}

}
