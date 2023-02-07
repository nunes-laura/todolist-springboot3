package com.excercise.todolist.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException (Object id) {
		super ("Resource not found. Id " + id + " does not exist");
	}

}