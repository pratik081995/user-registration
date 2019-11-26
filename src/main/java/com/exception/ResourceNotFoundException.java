package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(int id) {
		super("User not found for this id: " + id);
	}

	public ResourceNotFoundException(String fname) {
		super("User not found for this name :" + fname);
	}

}
