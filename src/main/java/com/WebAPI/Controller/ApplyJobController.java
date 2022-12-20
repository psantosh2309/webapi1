package com.WebAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.WebAPI.Model.ApplyJobs;
import com.WebAPI.Repository.ApplyJobRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class ApplyJobController {
	
	@Autowired
	private ApplyJobRepository applyjobrepo;
	
	@PostMapping("/savejob")
	public ApplyJobs saveJob(@RequestBody ApplyJobs applyJobs ) {
		return applyjobrepo.save(applyJobs);
		
	}
	@GetMapping("/getdata")
	public List<ApplyJobs> getdata() {
		return  applyjobrepo.findAll();
		
	}
	@DeleteMapping("/delete/{id}")                              //deleteMapping means delete the id--------idempotent
                                                                   //(it doesn't change the data)
    public List<ApplyJobs> deleteData(@PathVariable Long id) {  
		applyjobrepo.deleteById(id);
       return applyjobrepo.findAll();


     }  

	
//	  @DeleteMapping("{id}")
//	    public ResponseEntity<Long> deletePost(@PathVariable("id") Long id) {
//
//	        var isRemoved = applyjobrepo.delete(id);
//
//	        if (!isRemoved) {
//	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	        }
//
//	        return new ResponseEntity<>(id, HttpStatus.OK);
//	    }
//	@DeleteMapping("/deletedata/{id}")
//	public ApplyJobs deletedata(@PathVariable Long id) {
//		return applyjobrepo.deleteById(id);
// }

	}
