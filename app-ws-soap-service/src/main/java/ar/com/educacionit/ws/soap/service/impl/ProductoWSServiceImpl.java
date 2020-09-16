package ar.com.educacionit.ws.soap.service.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.app.domain.TipoProducto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.soap.service.ProductoWSService;
import ar.com.educacionit.ws.soap.service.WSSoapExeption;

@WebService(endpointInterface = "ar.com.educacionit.ws.soap.service.ProductoWSService")
public class ProductoWSServiceImpl implements ProductoWSService {

	private ProductoService productoService;
	
	public ProductoWSServiceImpl() {
		productoService = new ProductoServiceImpl();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public List<Producto> findProductos() {
		List<Producto> listado;
		try {
			 listado = this.productoService.findProductos();
		
			} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			listado = null;
		}
		return listado;
	}



	
	
	
	@Override
	public Producto createProducto(CreateProductoDTO productoRequest) throws WSSoapExeption {
		
		TipoProducto tipo = new TipoProducto();
		tipo.setId(productoRequest.getTipoProducto());
		Producto productoNuevo = new Producto(productoRequest.getTitulo(),
				productoRequest.getPrecio(), 
				productoRequest.getCodigo(), tipo);
			Producto productoCreado;
			try {
				productoCreado = this.productoService.createProducto(productoNuevo);
			} catch (ServiceException e) {
				System.err.println(e);
				//puede lanzar excepciones de servicio 
				//por ejemplo
				//LOG4J
				//LOGBACK
				//SLF4
				productoCreado = null;
				throw new WSSoapExeption(e);
				
				
				}
			return productoCreado;
		
	}

//puede lanzar excepciones de servicio 
	//por ejemplo
	//LOG4J
	//LOGBACK
	//SLF4










	@Override
	public Producto deleteByCodigo(CreateProductoDTO productoRequest) {
				Producto productoN = new Producto(null, null, productoRequest.getCodigo(), null);
				
		
				try {
				 return productoService.eliminarProducto(productoN.getCodigo());
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
				return productoN;
	}



	
}
