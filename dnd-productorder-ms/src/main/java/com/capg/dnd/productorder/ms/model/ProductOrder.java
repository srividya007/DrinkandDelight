package com.capg.dnd.productorder.ms.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="PRODUCT_ORDER")
public class ProductOrder {
	@Id
	private String orderId;
	private String name;
	private String distributorId;
	private double quantityValue;
	
	private String quantityUnit;
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateofOrder;
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateofDelivery;
	private double pricePerunit;
	private double totalPrice;
	private String deliveryStatus;
	private String warehouseId;
	
	
public ProductOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

public ProductOrder(String orderId, String name) {
	super();
	this.orderId = orderId;
	this.name = name;
}

public ProductOrder(String orderId, String name, String distributorId, double quantityValue,
			String quantityUnit, Date dateofOrder, Date dateofDelivery, double pricePerunit, double totalPrice,
			String deliveryStatus, String warehouseId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.distributorId = distributorId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.dateofOrder = dateofOrder;
		this.dateofDelivery = dateofDelivery;
		this.pricePerunit = pricePerunit;
		this.totalPrice = totalPrice;
		this.deliveryStatus = deliveryStatus;
		this.warehouseId = warehouseId;
	}

public ProductOrder(String orderId, String name, double totalPrice) {
	super();
	this.orderId = orderId;
	this.name = name;
	this.totalPrice = totalPrice;
}

public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getdistributorId() {
	return distributorId;
}
public void setdistributorId(String distributorId) {
	this.distributorId = distributorId;
}
public double getQuantityValue() {
	return quantityValue;
}
public void setQuantityValue(double quantityValue) {
	this.quantityValue = quantityValue;
}
public String getQuantityUnit() {
	return quantityUnit;
}
public void setQuantityUnit(String quantityUnit) {
	this.quantityUnit = quantityUnit;
}
public Date getDateofOrder() {
	return dateofOrder;
}
public void setDateofOrder(Date dateofOrder) {
	this.dateofOrder = dateofOrder;
}
public Date getDateofDelivery() {
	return dateofDelivery;
}
public void setDateofDelivery(Date dateofDelivery) {
	this.dateofDelivery = dateofDelivery;
}
public double getPricePerunit() {
	return pricePerunit;
}
public void setPricePerunit(double pricePerunit) {
	this.pricePerunit = pricePerunit;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public String getDeliveryStatus() {
	return deliveryStatus;
}
public void setDeliveryStatus(String deliveryStatus) {
	this.deliveryStatus = deliveryStatus;
}
public String getWarehouseId() {
	return warehouseId;
}
public void setWarehouseId(String warehouseId) {
	this.warehouseId = warehouseId;
}

@Override
public String toString() {
	return "ProductOrderService [orderId=" + orderId + ", name=" + name + ", distributorId=" + distributorId
			+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", dateofOrder=" + dateofOrder
			+ ", dateofDelivery=" + dateofDelivery + ", pricePerunit=" + pricePerunit + ", totalPrice=" + totalPrice
			+ ", deliveryStatus=" + deliveryStatus + ", warehouseId=" + warehouseId + "]";
}
}
