package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

public class MyRestaurantCreation implements Serializable {
	private Long id;
	private String city;
	private String name;
	private String contact;
	private String address;
	private String description;
	private String website;
	private Integer likeCount;
	public MyRestaurantCreation() {
		super();
		
	}
	public MyRestaurantCreation(Long id, String city, String name, String contact, String address, String description,
			String website, Integer likeCount) {
	super();
		this.id = id;
		this.city = city;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.description = description;
		this.website = website;
		this.likeCount = likeCount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	

}
