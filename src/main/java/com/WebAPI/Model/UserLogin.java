package com.WebAPI.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserLogin")
public class UserLogin {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private String confirm_Password;
    
	public UserLogin() {
		
	}
	public UserLogin(Long id, String username, String email, String password, String confirm_Password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirm_Password = confirm_Password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_Password() {
		return confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		this.confirm_Password = confirm_Password;
	}
	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", confirm_Password=" + confirm_Password + "]";
	}
    

}
