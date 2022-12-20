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
import com.WebAPI.Model.UserDashboard;
import com.WebAPI.Repository.UserDashboardRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class UserDashboardController {
	@Autowired
	private UserDashboardRepository userDashboardRepo;

	        
	@GetMapping("/dashboarduser12")
    public List<UserDashboard> getjob( ){
		
	return  userDashboardRepo.findAll();
	
	}
		

		
	
	@PostMapping("/jobs")
	public UserDashboard saveUSer(@RequestBody UserDashboard userDashboard ) {
//		LoginModel loginmodel= new LoginModel();
//		loginmodel.getUsername();
		return userDashboardRepo.save(userDashboard);
		
	}
//	 @PostMapping("/dash2")
//	 public List<UserDashboard> saveData(LoginModel loginmodel ){
//		 loginmodel.getUsername();
//		return userDashboardRepo.save(loginmodel);
//			
//		 }
}
