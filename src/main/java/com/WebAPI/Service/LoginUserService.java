package com.WebAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebAPI.Model.LoginModel;
import com.WebAPI.Model.UserLogin;
import com.WebAPI.Repository.UserLoginRepository;

@Service
public class LoginUserService {
	@Autowired
	private UserLoginRepository userRepo;
	
	public UserLogin  login1(String username, String password,String email) {
		  
		UserLogin  user1 = userRepo.findByUsernameAndPasswordAndEmail(username, password,email);
	  	return user1;
	  }

	public UserLogin save(UserLogin userLogin) {
		
		return userRepo.save(userLogin);
	}
}
