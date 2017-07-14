package com.sergio.archivobusiness.entity.repositorio.imp;

import java.util.List;

import com.sergio.archivobusiness.entity.Cliente;
import com.sergio.archivobusiness.entity.repositorio.ClientesRepository;

public class ClientesRepositoryImp implements ClientesRepository {

	@Override
	public void save(Cliente entity) {
		System.out.println("El cliente " + entity.getNombre() + " A sido guardado");
	}

	@Override
	public void findByName(Cliente entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void findById(Long entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Cliente entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
