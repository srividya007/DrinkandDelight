 package com.capg.dnd.productorder.ms.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.dnd.productorder.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productorder.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productorder.ms.model.ProductOrder;
import com.capg.dnd.productorder.ms.repository.IProductOrderRepo;
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class ProductOrderServiceImplTest {
 @Autowired
 ProductOrderServiceImpl service;
 //@Autowired
 @MockBean
 IProductOrderRepo repo;
 
 
 //ProductOrder order;
 @Test
 public void testAddProductOrder() throws ProductOrderIdAlreadyExistsException {
	 ProductOrder order=new  ProductOrder();
	 order.setOrderId("1");
	 order.setName("mummy");
	 Mockito.when(repo.save(order)).thenReturn(order);
	 assertEquals(order,service.addProductOrder(order));
 }
  @Test
  public void testGetAllProductOrders() {
	service.getAllProductOrders();
	verify(repo).findAll();
}

  @Test
  public void testDeleteProductOrder() throws ProductOrderIdNotFoundException{
	service.deleteProductOrder("15");
	verify(repo).deleteById("15");
}
 
	
	  @Test public void testGetProductOrderById() throws
	  ProductOrderIdNotFoundException{ service.getProductOrderDetailById("33");
	  verify(repo).findById("33"); 
	  }
	 

}
