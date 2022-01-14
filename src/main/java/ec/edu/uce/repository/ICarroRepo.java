package ec.edu.uce.repository;

import ec.edu.uce.modelo.Carro;
;

public interface ICarroRepo {

	void insertarCarro(Carro carro);
	Carro buscarCarro(Integer id);
	void actualizarCarro(Carro carro);
	void borrarCarro(Integer id);
}
