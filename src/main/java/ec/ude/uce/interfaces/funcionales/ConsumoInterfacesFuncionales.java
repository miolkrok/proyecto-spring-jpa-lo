package ec.ude.uce.interfaces.funcionales;

public class ConsumoInterfacesFuncionales {
	
	public String consumoSupplier(IPersonaSupplier<String> funcion) {
		return funcion.get();
	}
	
	public void consumirConsumer(IPersonaConsumer<Integer> funcion, Integer valor) {
		funcion.accept(valor);
	}
	public boolean consumirPredicate(IPersonaPredicate<String> funcion, String valor) {
		return funcion.evaluar(valor);
		
	}
	public Integer consumirFunction(IPersonaFunction<String, Integer> funcion, String cadena) {
		return funcion.apply(cadena);
	}

}
