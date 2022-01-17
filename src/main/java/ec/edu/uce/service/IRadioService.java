package ec.edu.uce.service;

import ec.edu.uce.modelo.Radio;

public interface IRadioService {
	void insertarRadioNuevo(Radio radio);
	void actualizarRadioNuevo(Radio radio);
	void borrarRadioPorId(Integer id);
	Radio buscarRadioPorId(Integer id);
}
