package br.com.studyspringboot.exception;

public class NotFoundException extends Exception {

	public NotFoundException() {
		super();
	}
	
	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(Throwable throwable) {
		super(throwable);
	}

	public NotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
