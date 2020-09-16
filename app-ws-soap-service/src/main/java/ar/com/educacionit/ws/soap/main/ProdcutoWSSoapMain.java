package ar.com.educacionit.ws.soap.main;

import javax.xml.ws.Endpoint;

import ar.com.educacionit.ws.soap.service.impl.ProductoWSServiceImpl;

public class ProdcutoWSSoapMain {

	public static void main(String[] args) {
		System.out.println("publicando soap en el puerto 8082");

		
	Endpoint.publish("http://localhost:8080/", new ProductoWSServiceImpl());
			//para utilizar en el soap usar:
		
			// *****   http://localhost:8080/?wsdl   ******
	
	
	//Endpoint.publish("http://127.0.0.1:8090/", new ProductoWSServiceImpl());
		//se puede usar el localhos o bien la direccion de ip
		
	System.out.println("Se ha iniciado el ws en http://localhost:8080/ws");
	
	}

}
