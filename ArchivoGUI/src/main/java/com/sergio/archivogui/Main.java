lpackage com.sergio.archivogui;

import com.sergio.archivobusiness.entity.Cliente;
import com.sergio.archivobusiness.entity.Factura;
import com.sergio.archivobusiness.entity.Producto;
import com.sergio.archivobusiness.entity.Usuario;
import com.sergio.archivobusiness.entity.repositorio.ClientesRepository;
import com.sergio.archivobusiness.entity.repositorio.FacturasRepository;
import com.sergio.archivobusiness.entity.repositorio.ProductosRepository;
import com.sergio.archivobusiness.entity.repositorio.UsuariosRepository;
import com.sergio.archivobusiness.enums.RepositoryEnum;
import com.sergio.archivobusiness.factory.AppContext;

public class Main {

	public static void main(String[] args){
		
		Usuario us = new Usuario();
		us.setId((long) 0001);
		us.setNombre("Sergio Joel");
		us.setApellido("Ferreras Batista");
		
		Factura fact = new Factura();
		fact.setId((long) 001);
		fact.setDescripcion_Producto("SoC Intel i7");
		
		Cliente cli = new Cliente();
		cli.setId((long) 002);
		cli.setNombre("Julio");
		cli.setApellido("Pelegrino");
		
		Producto pro = new Producto();
		pro.setId((long) 003);
		pro.setMarca("Intel i7");
		
		UsuariosRepository usuarios = (UsuariosRepository) AppContext.getRepository(RepositoryEnum.USUARIO_REPO);
		usuarios.save(us);
		
		FacturasRepository facturas = (FacturasRepository) AppContext.getRepository(RepositoryEnum.FACTURA_REPO);
		facturas.save(fact);
		
		ClientesRepository clientes = (ClientesRepository) AppContext.getRepository(RepositoryEnum.CLIENTE_REPO);
		clientes.save(cli);
		
		ProductosRepository productos = (ProductosRepository) AppContext.getRepository(RepositoryEnum.PRODUCTO_REPO);
		productos.save(pro);
		
		
		
	}
	
}
