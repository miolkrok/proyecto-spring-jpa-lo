package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Actor;
import ec.edu.uce.modelo.jpa.Cantante;

public interface ICantanteRepo {

	void insertarCantante(Cantante cantante);
	void actualizarCantante(Cantante cantante);
	Cantante buscarCantantePorId(Integer id);
	void borrarCantantePorId(Integer id);
	Cantante buscarCantantePorNombre(String nombre);
	Cantante buscarCantantePorNombreTyped(String nombre);
	Cantante buscarCantantePorNombreNamed(String nombre);
	Cantante buscarCantantePorNombreNative(String nombre);
	Cantante buscarCantantePorNombreNamedNative(String nombre);
	Cantante buscarCantantePorNombreCriteriaAPI(String nombre);
}
