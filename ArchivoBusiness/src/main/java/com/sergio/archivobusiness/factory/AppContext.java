package com.sergio.archivobusiness.factory;

import com.sergio.archivobusiness.entity.repositorio.Repository;
import com.sergio.archivobusiness.entity.repositorio.imp.ClientesRepositoryImp;
import com.sergio.archivobusiness.entity.repositorio.imp.FacturasRepositoryImp;
import com.sergio.archivobusiness.entity.repositorio.imp.ProductosRepositoryImp;
import com.sergio.archivobusiness.entity.repositorio.imp.UsuariosRepositoryImp;
import com.sergio.archivobusiness.enums.RepositoryEnum;

public class AppContext {
	
		@SuppressWarnings("rawtypes")
		public static Repository getRepository(RepositoryEnum repo){
			
		switch(repo){
		case FACTURA_REPO:
			return new FacturasRepositoryImp();
		case CLIENTE_REPO:
			return new ClientesRepositoryImp();
		case PRODUCTO_REPO:
			return new ProductosRepositoryImp();
		case USUARIO_REPO:
			return new UsuariosRepositoryImp();
		default:
			return null;
		}
	
	}
	
}
