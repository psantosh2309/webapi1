package com.WebAPI.Controller;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.WebAPI.Model.LoginModel;
import com.WebAPI.Repository.LoginRepository;
import com.WebAPI.Service.LoginService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class LoginController {
	
	@Autowired
    private LoginService userService;
	@Autowired
	private LoginRepository Loginrepos;
	

	

    
    
    @PostMapping("/login")
    public LoginModel Login1(@RequestBody LoginModel user) {
   LoginModel User1 = userService.login1(user.getUsername(), user.getPassword());
     return User1;
	}
    


}