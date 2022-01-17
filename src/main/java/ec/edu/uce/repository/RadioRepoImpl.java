package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Radio;
@Repository
public class RadioRepoImpl implements IRadioRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarRadio(Radio radio) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el estudiante");
		Object[] datosAInsertar = new Object[] { radio.getIdRadio(), radio.getNombreRadio(), radio.getNombreJefe(),
				radio.getDireccion(),radio.getFrecuencia() };

		this.jdbctemplate.update("insert into radio(idradio,nombreradio,nombrejefe,direccion,frecuencia)values(?,?,?,?,?)", datosAInsertar);
	}

	@Override
	public Radio buscarRadio(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarRadio(Radio radio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarRadio(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
