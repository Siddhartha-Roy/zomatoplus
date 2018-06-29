package com.thinkxfactor.zomatoplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.MyRestaurantCreation;
@RestController
@RequestMapping("/RestaurantAuthority")
public class MyRestaurantCreationController {
	@GetMapping("/RestaurantSignup")
	public List<MyRestaurantCreation> RestaurantSignup() {
		MyRestaurantCreation restaurant1=new MyRestaurantCreation(1001L,"Kolkata","Haji","987444444","Behala","Awesome fast food","www.HajiLove.com",4);
	return restaurant1;

}
	
	@PostMapping("/Restaurantcreate")
	public MyRestaurantCreation create(@RequestBody MyRestaurantCreation restaurant1) 
	{
		System.out.println(restaurant1.toString());
			return restaurant1;
		}
}
