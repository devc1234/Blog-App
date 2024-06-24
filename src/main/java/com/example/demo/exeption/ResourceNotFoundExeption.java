package com.example.demo.exeption;

public class ResourceNotFoundExeption extends RuntimeException{

	String resourceName;
	String FieldName;
	long fieldValue;
	public ResourceNotFoundExeption(String resourceName, String fieldName, long fieldValue) {
		super();
		this.resourceName = resourceName;
		FieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	
}
