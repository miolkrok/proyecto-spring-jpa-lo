package ec.ude.uce.interfaces.funcionales;

@FunctionalInterface
public interface IPersonaConsumer<T> {
	void accept(T arg1);

}
