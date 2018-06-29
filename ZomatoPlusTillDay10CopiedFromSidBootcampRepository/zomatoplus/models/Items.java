package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

//import java.io.Serializable;
@Entity
@Table(name="tbl_Item")
public class Items implements Serializable{
	
	@Id
	@GeneratedValue //auto-increment
	@Column(name="item_id")
	private Long id;
	
	@Column(name="restaurant_id")
	private Long restaurantId;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	
	@Column(name="description")
	private String description;
	
	public Items()
	{}
	}