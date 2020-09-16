package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.app.domain.TipoProducto;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.service.exceptions.ServiceException;

public interface ProductoService {

	
	//obtiene todos los productos de la bas de datos
	/*
		public List<Producto> findAll();
		public List<Producto> findProdcutos();
		
	
	//metodos crud o abm
	
	public Producto getById(Long idProducto);
	
	public Producto getByCodigo(String codigo);
	
	public Producto deleteProductoById(Long id);
	
	public Producto updateProducto(Producto producto);
	
	*/
	
	public Producto getProducto(String codigo) throws ServiceException;

	public List<Producto> findProductos() throws ServiceException;

	public Producto createProducto(Producto producto) throws ServiceException;
	
	public Producto updateProducto(Producto producto) throws ServiceException;

	public Producto eliminarProducto(String codigoProducto) throws ServiceException;
	
	public List<TipoProducto> findTipoProductos() throws ServiceException;

	public List<Producto> findProductosByDescripcion(String desripcion) throws ServiceException;

	
}
