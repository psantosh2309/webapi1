package com.WebAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebAPI.Model.LoginModel;
import com.WebAPI.Model.SkillTestModel;
import com.WebAPI.Repository.AssessmentRepository;
import com.WebAPI.Repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
	private AssessmentRepository assrep;
  
  public LoginModel login1(String username, String password) {
	  
	  LoginModel user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }



//public void UpdateSkillTest(Long id, SkillTestModel skilltest) {
//    
//	
//}
	

}