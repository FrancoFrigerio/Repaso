package ar.com.educacionit.dao.exceptions;

public class GenericExeption extends Exception {
	private static final long serialVersionaUID = -6818721669787938490L;
	
	public GenericExeption(String message) {
		super(message);
		
		// TODO Auto-generated constructor stub
	}

	public GenericExeption(String message, Exception e) {
		super(message,e);
		// TODO Auto-generated constructor stub
	}
}
