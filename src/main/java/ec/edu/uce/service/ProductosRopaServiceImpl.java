package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.ProductosRopa;
import ec.edu.uce.repository.IProductosRopaRepo;
@Service
public class ProductosRopaServiceImpl implements IProductosRopaService{

	@Autowired
	private IProductosRopaRepo productosRepo;
	@Override
	public void insertarProductosRopaNuevo(ProductosRopa productosRopa) {
		// TODO Auto-generated method stub
		this.productosRepo.insertarProductosRopa(productosRopa);
	}



}
