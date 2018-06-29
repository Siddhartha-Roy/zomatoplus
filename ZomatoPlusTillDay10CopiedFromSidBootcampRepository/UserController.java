package com.thinkxfactor.zomatoplus.controller;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;


@RestController
@RequestMapping("/user")
public class UserController {

	

	@GetMapping("/login")
	public List<User> userLogin() {
		User user1=new User("Messi","got");
		User user2=new User("Kohli","got");
		User user3=new User("Dhoni","got");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		return userList;
	}
	/*@GetMapping("/create")
	public User create(@RequestParam(value="username") String username,@RequestParam(value="password")String password) 
	{
			User user1=new User(username,password);
			return user1;
		}*/

	@PostMapping("/create")
	public User create(@RequestBody User user) 
	{
		System.out.println(user.toString());
			return user;
		}

	

}
