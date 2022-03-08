package ec.ude.uce.interfaces.funcionales;

@FunctionalInterface
public interface IPersonaFunction<T,R> {
	
	R apply(T arg1);
	

}
