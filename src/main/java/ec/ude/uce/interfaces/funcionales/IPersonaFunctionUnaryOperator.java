package ec.ude.uce.interfaces.funcionales;

@FunctionalInterface
//esta con error porque intenta representar que la funcion
//de la interfaz recibe y retorna el mismo tipo de dato
public interface IPersonaFunctionUnaryOperator<T/*,R*/> {
	
	T apply(T arg1);
	

}
