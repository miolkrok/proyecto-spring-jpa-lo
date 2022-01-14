package ec.edu.uce.repository;

import ec.edu.uce.modelo.Radio;

public interface IRadioRepo {
	void insertarRadio(Radio radio);
	Radio buscarRadio(Integer id);
	void actualizarRadio(Radio radio);
	void borrarRadio(Integer id);
}
