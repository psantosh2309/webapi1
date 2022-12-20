package com.WebAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebAPI.Model.LoginModel;
import com.WebAPI.Model.UserLogin;
import com.WebAPI.Repository.UserLoginRepository;
import com.WebAPI.Service.LoginUserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class UserLoginController {
	@Autowired
	private LoginUserService loginuserService;
	
	@PostMapping("/saveuserdata")
	public UserLogin saveUserData(@RequestBody UserLogin userLogin ) {
		return loginuserService.save(userLogin);
		
	}
	
	@PostMapping("/login1")
	public UserLogin getData(@RequestBody UserLogin userLogin){
		UserLogin response=loginuserService.login1(userLogin.getUsername(),userLogin.getPassword(),userLogin.getEmail());
		return  response;
		  
		
	}

}
