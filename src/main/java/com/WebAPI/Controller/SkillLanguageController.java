package com.WebAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.WebAPI.Repository.SkillLangRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class SkillLanguageController {
	
		@Autowired
		private SkillLangRepository skinlangrepository;	
	    
	    @GetMapping("/SkillLanguage")
		public List<SkillLanguageModel> getskinLang(){
			return skinlangrepository.findAll();
			
		}
	    @PostMapping("/saveData")
	    public  SkillLanguageModel saveData(@RequestBody SkillLanguageModel model)
	    {
			return skinlangrepository.save(model);
	    	
	    }
	    
	    @PutMapping("/update")
	    public  SkillLanguageModel update(@RequestBody SkillLanguageModel model)
	    {
			return skinlangrepository.save(model);
	    	
	    }
	   

}
