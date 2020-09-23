package com.capg.dnd.productorder.ms.service;




import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.productorder.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productorder.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productorder.ms.model.*;
import com.capg.dnd.productorder.ms.repository.*;




@Service

public class ProductOrderServiceImpl implements IProductOrderService {
  @PostConstruct
  void init() {
	  System.out.println("hello service");
  }
	
	@Autowired
	IProductOrderRepo repo;
	
	
	

	@Override
	public ProductOrder addProductOrder(ProductOrder order) throws ProductOrderIdAlreadyExistsException {
		if(repo.existsById(order.getOrderId())) {
			throw new ProductOrderIdAlreadyExistsException("orderId already Exists");
		}
		else {
	return repo.save(order);
		}
	}


	@Override
	public List<ProductOrder> getAllProductOrders() {
		return repo.findAll();
	}

	@Override
	public ProductOrder getProductOrderDetailById(String orderId) {
		return repo.getOne(orderId);
	}

	
	
	
	@Override
	public void deleteProductOrder(String orderId) throws ProductOrderIdNotFoundException{
		
			repo.deleteById(orderId);
	}
	

	@Override
	public ProductOrder updateProductOrder(ProductOrder order) {
		return repo.save(order);
	}

}
