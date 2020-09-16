package ar.com.educacionit.ws.soap.service;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ProductoService ps = new ProductoServiceImpl();
		
		List<Producto> productos;
		try {
			productos = ps.findProductos();
			
			
			for (Producto producto : productos) {
				System.out.println(producto);
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
