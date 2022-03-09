package ec.ude.uce.interfaces.funcionales;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainFuncional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		no se debe hacer
//		IPersonaSupplier<String> supplier = new PersonaSupplierChino();
//		System.out.println(supplier.get());
		
		//SUPPLIER
		IPersonaSupplier<String> supplierC = new PersonaSupplier();
		System.out.println(supplierC.get());
		
		IPersonaSupplier<String> supplier1 = () -> {
			return "HOLA MUNDO adicional las llaves";
			};
		System.out.println(supplier1.get());
		
		IPersonaSupplier<String> supplier2 = ()-> "Nǐ hǎo shìjiè";
		System.out.println(supplier2.get());
		
		ConsumoInterfacesFuncionales consumo = new ConsumoInterfacesFuncionales();
		String resultado = consumo.consumoSupplier(()-> "HOLAMUNDO!!!");
		System.out.println(resultado);
		//SUPPLIER EN JAVA
		
		Stream<String> test  = Stream.generate(()-> "HOLA").limit(100);//.forEach(x -> System.out.println(x));
//		test.forEach(x -> System.out.println(x + " PRUEBA"));
		//CONSUMER
		IPersonaConsumer<Integer> personaConsumer = number -> System.out.println(number);
		personaConsumer.accept(7);
		
		IPersonaConsumer<Integer> personaConsumer1 = number -> System.out.println(number.intValue() + 1);
		personaConsumer1.accept(7);
		
		consumo.consumirConsumer(numbre -> System.out.println(numbre + 10), 2);
		
		//Consumer JAVA
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6);
		listaNumeros.forEach(number -> System.out.println(number));
		
		
		System.out.println("PREDICATE");
		//PREDICATE
		boolean resultado2 = consumo.consumirPredicate(cadena -> cadena.contains("z"), "LUIS");
		System.out.println(resultado2);
		
		//Predicate en JAVA
		Stream<Integer> numeroFiltrados = listaNumeros.stream().filter(numero1 -> numero1>4);
		numeroFiltrados.forEach(num -> System.out.println(num));
		
		System.out.println("FUNCTION");
		//FUNCTION
		Integer resultado3 = consumo.consumirFunction(cadena -> Integer.parseInt(cadena) -7, "2");
		System.out.println(resultado3);
		
		//FUNCTION EN JAVA
		Stream<String> listaCambiada =  listaNumeros.stream().map(numeroLista -> numeroLista.toString() + " N");
		listaCambiada.forEach(cadena -> System.out.println(cadena));
		
		//UnaryFunctionOperator
		//listanumeros
		listaNumeros.stream().reduce(null);
		
	}

}
