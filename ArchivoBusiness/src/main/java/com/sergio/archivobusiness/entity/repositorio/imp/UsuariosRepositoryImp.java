package com.sergio.archivobusiness.entity.repositorio.imp;

import java.util.List;

import com.sergio.archivobusiness.entity.Usuario;
import com.sergio.archivobusiness.entity.repositorio.UsuariosRepository;

public class UsuariosRepositoryImp implements UsuariosRepository{

	@Override
	public void save(Usuario entity) {
		System.out.println("El usuario de nombre " + entity.getNombre() + " A sido guardado");
		
	}

	@Override
	public void findByName(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findById(Long entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
