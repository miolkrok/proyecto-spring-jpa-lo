package ec.ude.uce.interfaces.funcionales;

@FunctionalInterface
public interface IPersonaPredicate<T> {
	boolean evaluar(T arg1);

}
