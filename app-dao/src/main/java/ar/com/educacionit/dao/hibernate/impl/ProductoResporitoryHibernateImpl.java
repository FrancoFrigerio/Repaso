package ar.com.educacionit.dao.hibernate.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.app.domain.TipoProducto;
import ar.com.educacionit.dao.ProductoRepository;
import ar.com.educacionit.dao.exceptions.DuplicateException;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.dao.hibernate.HibernateUtils;
		


			//es la clase que tiene todo los metodos para acceder a la base de datos
public class ProductoResporitoryHibernateImpl implements ProductoRepository{
		private SessionFactory factory;
	
		
		public ProductoResporitoryHibernateImpl() {
			factory = HibernateUtils.getSessionFactory();
			
		}
		
		
		
		
		
		
		
		
		
		
		@Override
	public Producto getProducto(String codigo) throws GenericExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findProductos() throws GenericExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto createProducto(Producto producto) throws DuplicateException, GenericExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto) throws GenericExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteProducto(Producto producto) throws GenericExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoProducto> findTipoProductos() throws GenericExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findByDescripcion(String descripcion) throws GenericExeption {
		// TODO Auto-generated method stub
		return null;
	}

}
