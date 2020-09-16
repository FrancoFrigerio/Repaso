package ar.com.educacionit.ws.rest.configuracion;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
			responseContext.getHeaders().add("Access-Control-Allow-Origin", "*"); 
					//cualquiera puede acceder a nuestro dominio	
			responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
					//cuales headers van a ser expuestos a nuestro cliente
					
			responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
					//si le podemos mandar credenciales a nuestro servidor
			responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
					//cuales son los metodos que nuestro servidor va a estar respondiendo
			
			
			// TODO Auto-generated method stub
		
	}

}
