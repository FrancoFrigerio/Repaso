package ar.com.educacionit.ws.rest.resources;

import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

public class ProductoResources {
	private ProductoService productoservice;
	
	public ProductoResources() {
		this.productoservice = new ProductoServiceImpl();
		
		// TODO Auto-generated constructor stub
	}
	
@GET
@Produces(MediaType.APPLICATION_JSON)

public Response findAllProductos(){
	
	
	try {
		 List<Producto> productos = this.productoservice.findProductos();
		 return Response.ok(productos).build();
				 /*los tipos de respuesta estan ligados 
				 los status codes 100 *** 200 ***300 ***400 ** 500*/
				 
				 
	} catch (ServiceException e) {
		return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		
		
	}
	
	
}

}	
