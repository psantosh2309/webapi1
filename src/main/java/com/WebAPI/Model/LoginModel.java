package com.WebAPI.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="login")
public class LoginModel {
@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String EmailId;
    private String password;
    private String confirm_password;
 
    
public LoginModel()
{
}
 
public LoginModel(Long id, String username, String EmailId, String password, String confirm_password ) {
this.id = id;
this.username = username;
this.EmailId = EmailId;
this.password = password;
this.confirm_password = confirm_password;

}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}

public String getEmailId() {
	return EmailId;
}

public void setEmailId(String emailId) {
	EmailId = emailId;
}

public String getConfirm_password() {
	return confirm_password;
}

public void setConfirm_password(String confirm_password) {
	this.confirm_password = confirm_password;
}




}

