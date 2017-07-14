package com.sergio.archivobusiness.entity.repositorio.imp;

import java.util.List;

import com.sergio.archivobusiness.entity.Producto;
import com.sergio.archivobusiness.entity.repositorio.ProductosRepository;

public class ProductosRepositoryImp implements ProductosRepository {

	@Override
	public void save(Producto entity) {
		System.out.println("El producto de marca " + entity.getMarca() + " A sido guardado");
		
	}

	@Override
	public void findByName(Producto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Producto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findById(Long entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
