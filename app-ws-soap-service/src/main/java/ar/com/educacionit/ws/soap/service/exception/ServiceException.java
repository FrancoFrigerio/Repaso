package ar.com.educacionit.ws.soap.service.exception;

public class ServiceException extends Exception {

private static final long serialVersionUID = 7367805002615078145L;

public ServiceException(String message) {
	super(message);
}

public ServiceException(String message, Exception e) {
	super(message, e);
}
}
