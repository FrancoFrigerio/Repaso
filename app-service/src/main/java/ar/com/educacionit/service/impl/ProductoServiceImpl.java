package ar.com.educacionit.service.impl;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.dao.ProductoRepository;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.dao.hibernate.impl.ProductoResporitoryHibernateImpl;
import ar.com.educacionit.service.ProductoService;

public class ProductoServiceImpl implements ProductoService{
	
	//para poder acceder a la capa del DAO
	//instaciamos el repositorio, que es una interfaz
	
	private ProductoRepository productoRepository;
	
	public ProductoServiceImpl() {
	this.productoRepository = new ProductoResporitoryHibernateImpl();
	
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public List<Producto> findAll() {
		List<Producto> listado = null;
		try {
			
			//this.productoRepository.findProductos();
			listado = productoRepository.findProductos();
		} catch (GenericExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return listado;
	}

	@Override
	public Producto getById(Long idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteProductoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Producto> findProdcutos() {
		List<Producto> productos = null;
		try {
			
			productos = this.productoRepository.findProductos();
		return productos;
		
			} catch (GenericExeption e) {
			e.printStackTrace();
			System.out.println("Error fatal en el metodo");
			
		}
		return null;
	}

}
