package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.MyUser;

	@RestController
	@RequestMapping("/user")
	public class MyUserController {

		

		@GetMapping("/signup")
		public List<MyUser> userSignup() {
			MyUser user1=new MyUser("Messi","got");
			MyUser user2=new MyUser("Kohli","got");
			MyUser user3=new MyUser("Dhoni","got");
			List<MyUser> userList=new ArrayList<MyUser>();
			userList.add(user1);
			userList.add(user2);
			userList.add(user3);
			return userList;
		}
		
		@PostMapping("/create")
		public MyUser create(@RequestBody MyUser user) 
		{
			System.out.println(user.toString());
				return user;
			}

		

}
