package ar.com.educacionit.service.impl;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.app.domain.TipoProducto;
import ar.com.educacionit.dao.ProductoRepository;
import ar.com.educacionit.dao.exceptions.DuplicateException;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.dao.hibernate.impl.ProductoResporitoryHibernateImpl;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;

public class ProductoServiceImpl implements ProductoService{
	
	//para poder acceder a la capa del DAO
	//instaciamos el repositorio, que es una interfaz
	
	private ProductoRepository productoRepository;
	
	public ProductoServiceImpl() {
	this.productoRepository = new ProductoResporitoryHibernateImpl();
	
		// TODO Auto-generated constructor stub
	}
	
	
	
	


	
	
	
	
	@Override
	public Producto getProducto(String codigo) throws ServiceException {
		
		return null;
	}

//**********************************************************************
	@Override
	public List<Producto> findProductos() throws ServiceException {
		List<Producto> productos = null;
		
		try {
			
			productos = this.productoRepository.findProductos();
		return productos;
		
			} catch (GenericExeption e) {
			e.printStackTrace();
			System.out.println("Error fatal en el metodo");
				
			return null;
		}
		
	}


	@Override
	public Producto createProducto(Producto producto) throws ServiceException {
		try {
			return this.productoRepository.createProducto(producto);
		} catch (DuplicateException e) {
			throw new ServiceException("Producto duplicado" + e);
			
		} catch (GenericExeption e) {
			throw new ServiceException("No se pudo crear el producto" + e);

			
		}
		
	}


	@Override
	public Producto eliminarProducto(String codigoProducto) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<TipoProducto> findTipoProductos() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Producto> findProductosByDescripcion(String desripcion) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Producto updateProducto(Producto producto) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
