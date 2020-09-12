package ar.com.educacionit.ws.soap.service;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ProductoService ps = new ProductoServiceImpl();
		
		List<Producto> productos = ps.findProdcutos();
		
		
		System.out.println(productos);
		
	}
}
