package com.thinkxfactor.zomatoplus.controller;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.MyUSerLogin;

@RestController
@RequestMapping("/user")

public class MyUSerLoginController {
	@GetMapping("/login")
	public List<MyUSerLogin> userLogin() {
		MyUSerLogin user1=new User("Messi","got");
		
	
		return (List<MyUSerLogin>) user1;
		
	}
	@PostMapping("/takeDetails")
	public MyUSerLogin create(@RequestBody MyUSerLogin user) 
	{
		System.out.println(user.toString());
			return user;
		}

	

}
