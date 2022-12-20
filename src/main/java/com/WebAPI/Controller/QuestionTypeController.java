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
import com.WebAPI.Model.QuestionTypeModel;
import com.WebAPI.Repository.QuestionTypeRepository;
import com.WebAPI.Repository.RegisterRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class QuestionTypeController {
	
	@Autowired	
	private QuestionTypeRepository questionrepository;
	
	@GetMapping("/getQuestion")
     public List<QuestionTypeModel> getData() {
		return questionrepository.findAll();
		
	}
	@PostMapping("/Question")
	public QuestionTypeModel CreateUser(@RequestBody QuestionTypeModel user) 
	
	{
		//System.out.println(user.getChoiceForm());
		return questionrepository.save(user);
	}
	

}
