package ar.com.educacionit.ws.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.ws.soap.service.impl.CreateProductoDTO;

@WebService
public interface ProductoWSService {
	
	@WebMethod
	public List<Producto> findProductos();
	
	@WebMethod
	public Producto createProducto(CreateProductoDTO productoRequest)throws WSSoapExeption;
	
	@WebMethod
	public Producto deleteByCodigo(CreateProductoDTO productoRequest) throws WSSoapExeption;
	
	
	
}
	