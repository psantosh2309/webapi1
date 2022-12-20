package com.WebAPI.Controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebAPI.Exception.ResourceNotFoundException;
import com.WebAPI.Model.LoginModel;
import com.WebAPI.Model.SkillLanguageModel;
import com.WebAPI.Model.SkillTestModel;
import com.WebAPI.Repository.AssessmentRepository;
import com.WebAPI.Service.LoginService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/")

public class AssessmentController {
    @Autowired
	private AssessmentRepository assessmentrepository;
    @Autowired
    private LoginService userService;
    
    @GetMapping("/Assessment12")
	public List<SkillTestModel> getalluser(){
		return assessmentrepository.findAll();
		
	}
    
   
	// Create user rest api

	@PostMapping("/Assessment1")
	public SkillTestModel CreateUser(@RequestBody SkillTestModel SkillTest) 
	{
//		System.out.println(SkillTest);
		return assessmentrepository.save(SkillTest);
		
	}
	
	
	 
	// get id rest api
	@GetMapping("/Assessment/{id}")
	public  ResponseEntity<SkillTestModel>  GetSkillTestId(@PathVariable Long id) {
		System.out.println(id);
		SkillTestModel rs = assessmentrepository.findById(id).
	    		 orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:" + id));
	      return ResponseEntity.ok(rs); 
		
	}
	
	
	  @PutMapping("/Assessment123/{id}")
//	  public SkillTestModel updateData(@RequestBody SkillTestModel SkillTest) 
//		{
//
//			return assessmentrepository.save(SkillTest);
//			
//		}
	    public ResponseEntity<SkillTestModel> updateSkillTest(@PathVariable Long id, @RequestBody SkillTestModel skilltest){
		  SkillTestModel user = assessmentrepository.findById(id)
	                .orElseThrow();
	        user.setSkillTest(skilltest.getSkillTest());
	        user.setExperience(skilltest.getExperience());
	        user.setEnddate(skilltest.getEnddate());
	        SkillTestModel updatedskilltest =assessmentrepository.save(user);
	        return ResponseEntity.ok(updatedskilltest);
	       
	    }
	  

	  @DeleteMapping("/Assessment/{id}")
//	  public List<SkillTestModel> deletedata(@PathVariable Long id) {
//		  assessmentrepository.deleteById(id);
//		return  assessmentrepository.findAll();
//		  
//	  }
	    public ResponseEntity<Map<String, Boolean>> DeleteSkillSet(@PathVariable Long id){
		  SkillTestModel user = assessmentrepository.findById(id)
	                .orElseThrow();
	      
	       assessmentrepository.delete(user);
	       Map<String, Boolean> response = new HashMap<>();
	        response.put("Deleted", Boolean.TRUE);
	        return ResponseEntity.ok(response);
	       
	    }

	  
	

}
