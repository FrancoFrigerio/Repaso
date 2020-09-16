package ar.com.educacionit.ws.soap.service;

import ar.com.educacionit.service.exceptions.ServiceException;

public class WSSoapExeption extends Exception {

	public WSSoapExeption(ServiceException e) {
		super(e);
		
		// TODO Auto-generated constructor stub
	}

	
	
}
