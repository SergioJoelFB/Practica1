package com.sergio.archivobusiness.entity.repositorio.imp;

import java.util.List;

import com.sergio.archivobusiness.entity.Factura;
import com.sergio.archivobusiness.entity.repositorio.FacturasRepository;

public class FacturasRepositoryImp implements FacturasRepository {

	@Override
	public void save(Factura entity) {
		System.out.println("La factura de numero " + entity.getId() + " A sido guardada");
	}

	@Override
	public void findByName(Factura entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findById(Long entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Factura entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
