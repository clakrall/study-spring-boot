package br.com.studyspringboot.exception;

public class ModelExistentException extends Exception {

	public ModelExistentException() {
		super();
	}
	
	public ModelExistentException(String message) {
		super(message);
	}

	public ModelExistentException(Throwable throwable) {
		super(throwable);
	}

	public ModelExistentException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
