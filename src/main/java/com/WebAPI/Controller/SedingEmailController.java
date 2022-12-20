package com.WebAPI.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebAPI.Model.SendingEmail;
import com.WebAPI.Repository.SendingEmailRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class SedingEmailController {
	
	   @Autowired
	    private JavaMailSender mailSender;
	@Autowired
	private SendingEmailRepository sendRepo;

  @PostMapping("/sendEmail")
  public String  sendData(HttpServletRequest res) {
	  String username =res.getParameter("username");
	  String email =res.getParameter("email");
	  String subject=res.getParameter("subject");
	  String content=res.getParameter("content");
	  SimpleMailMessage message= new SimpleMailMessage();
	  message.setFrom("dfgh@gmail.com");
	  message.setTo("ghj@gmail.com");
	  String mailSubject=username;
	  String mailContext=username;
	  mailContext +="email";
	  mailContext +="subject";
	  mailContext +="content";
	  message.setSubject(mailSubject);
	  message.setText(mailContext);
	  mailSender.send(message);
	return "message";
	  
  }
  @GetMapping("/get1")
  public List<SendingEmail> getData() {
	return  sendRepo.findAll();
	  
  }

	
	
}
