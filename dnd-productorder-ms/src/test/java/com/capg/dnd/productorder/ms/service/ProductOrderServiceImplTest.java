 package com.capg.dnd.productorder.ms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.dnd.productorder.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productorder.ms.model.ProductOrder;
import com.capg.dnd.productorder.ms.repository.IProductOrderRepo;
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class ProductOrderServiceImplTest {
 @Autowired
 ProductOrderServiceImpl service;
 @Autowired
 IProductOrderRepo repo;
 
 ProductOrder order;
 @BeforeAll
	
	
	  void testInit() throws ProductOrderIdAlreadyExistsException { order =new
	  ProductOrder("4066" ,"apple"); if(!(repo.existsById("4066"))) {
	  service.addProductOrder(order); }
	  
	  }
	 

	@Test
	void testAddProductOrder() throws ProductOrderIdAlreadyExistsException {
		ProductOrder sentOrder=new ProductOrder("4066","apple");
		ProductOrder addProductOrder=service.addProductOrder(sentOrder);
		assertEquals(sentOrder,addProductOrder);
	
	}

	@Test
    void testGetAllProductOrders() {
		assertTrue(service.getAllProductOrders()!=null);
		
	
	}

	@Test
	void testGetProductOrderDetailById() {
		assertTrue(service.getProductOrderDetailById("4032")!=null);
		
	}

	/*
	 * @Test void testDeleteProductOrder() {
	 * assertTrue(service.deleteProductOrder("4032")=null); }
	 */
//
//	@Test
//	void testUpdateProductOrder() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFetchDistributorIds() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFetchDistributorDetail() {
//		fail("Not yet implemented");
//	}

}
