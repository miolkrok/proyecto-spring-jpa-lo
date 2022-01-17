package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Carro;
@Repository
public class CarroRepoImpl implements ICarroRepo {

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarCarro(Carro carro) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el carro");
		Object[] datosAInsertar = new Object[] { carro.getIdCarro(), carro.getNombrePropietario(), carro.getMarca(),
				carro.getPlaca(),carro.getPrecioCarro() };

		this.jdbctemplate.update("insert into carro(idcarro,nombrepropietario,marca,placa,preciocarro)values(?,?,?,?,?)", datosAInsertar);
	}

	@Override
	public Carro buscarCarro(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCarro(Carro carro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCarro(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
