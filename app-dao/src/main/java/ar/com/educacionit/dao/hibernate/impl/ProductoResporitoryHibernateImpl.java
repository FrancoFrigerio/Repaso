package ar.com.educacionit.dao.hibernate.impl;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;

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
		
		return null;
	}

	@Override
	public List<Producto> findProductos() throws GenericExeption {
				
		
			Session session = factory.getCurrentSession();

			List<Producto> products = new ArrayList<Producto>();
			
			try {

				// All the action with DB via Hibernate
				// must be located in one transaction.
				// Start Transaction.
				session.getTransaction().begin();

				// Create an HQL statement, query the object.
				String sql = "Select e from " + Producto.class.getName() + " e ";
				
				// Create Query object.
				Query<Producto> query = session.createQuery(sql);

				// Execute query.
				products = query.getResultList();

				// Commit data.
				session.getTransaction().commit();

			} catch (Exception e) {
				e.printStackTrace();
				// Rollback in case of an error occurred.
				session.getTransaction().rollback();
			}
			return products;
		
	}

	@Override
	public Producto createProducto(Producto producto) throws DuplicateException, GenericExeption {
		Session session = factory.getCurrentSession();

		try {

			// All the action with DB via Hibernate
			// must be located in one transaction.
			// Start Transaction.
			session.getTransaction().begin();

			session.saveOrUpdate(producto);
			
			// Commit data.
			session.getTransaction().commit();
		}catch (ConstraintViolationException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			System.out.println("Error en el ProductoRepository");
			throw new DuplicateException(e.getCause().getMessage(),e);
			
		} catch (Exception e) {
			e.printStackTrace();
			// Rollback in case of an error occurred.
			session.getTransaction().rollback();
			System.out.println("Error en el ProductoRepository");

			throw new GenericExeption(e.getMessage(),e);

		}finally {
			session.close();
		}
		return producto;
		
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
