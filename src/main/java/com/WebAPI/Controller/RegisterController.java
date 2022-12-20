package com.WebAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebAPI.Exception.ResourceNotFoundException;
import com.WebAPI.Model.LoginModel;
import com.WebAPI.Repository.RegisterRepository;

import java.util.List;

	@CrossOrigin(origins="http://localhost:4200")
	@RestController
	@RequestMapping("api/v1/")
	public class RegisterController {
		
	@Autowired	
	private RegisterRepository registerrepository;

	//Get all RegisterUser
	@GetMapping("/Users")
	public List<LoginModel> getalluser(){
		return registerrepository.findAll();
		
	}

	// Create user rest api

	@PostMapping("/Users")
	public LoginModel CreateUser(@RequestBody LoginModel user) 
	
	{
		System.out.println(user);
		return registerrepository.save(user);
	}



      


	// get id rest api
	@GetMapping("/Users/{id}")
	public ResponseEntity<LoginModel> getUserId(@PathVariable Long id) {
	
		LoginModel rs = registerrepository.findById(id).
	    		 orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:" + id));
	      return ResponseEntity.ok(rs); 
	}






	}
	 


