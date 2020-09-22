package com.capg.dnd.productorder.ms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



public class ProductOrderIdNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ProductOrderIdNotFoundException(String msg) {
		super(msg);
	}
	
	public ProductOrderIdNotFoundException(String msg,Throwable e){
        super(msg,e);
    }
}