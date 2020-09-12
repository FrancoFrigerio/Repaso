package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.dao.exceptions.GenericExeption;

public interface ProductoService {

	
	//obtiene todos los productos de la bas de datos
	
		public List<Producto> findAll();
		public List<Producto> findProdcutos();
		
	
	//metodos crud o abm
	
	public Producto getById(Long idProducto);
	
	public Producto getByCodigo(String codigo);
	
	public Producto deleteProductoById(Long id);
	
	public Producto updateProducto(Producto producto);
	
	
	
}
