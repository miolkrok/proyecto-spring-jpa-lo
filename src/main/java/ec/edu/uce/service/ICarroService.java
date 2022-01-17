package ec.edu.uce.service;

import ec.edu.uce.modelo.Carro;
import ec.edu.uce.modelo.Paciente;


public interface ICarroService {

	void insertarCarroNuevo(Carro carro);
	void actualizarCarroNuevo(Carro carro);
	void borrarCarroPorId(Integer id);
	Carro buscarCarroPorId(Integer id);
}
