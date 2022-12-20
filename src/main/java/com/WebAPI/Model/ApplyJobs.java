package com.WebAPI.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplyJobs {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String title ;
    private String designation;
    private String experience;
    private String location;
    private String username;
    private String email;
    
	public ApplyJobs() {
		super();
	
	}

    
	public ApplyJobs(Long id, String title, String designation, String experience, String location, String username,
			String email) {
		super();
		this.id = id;
		this.title = title;
		this.designation = designation;
		this.experience = experience;
		this.location = location;
		this.username = username;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
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


	@Override
	public String toString() {
		return "ApplyJobs [id=" + id + ", title=" + title + ", designation=" + designation + ", experience="
				+ experience + ", location=" + location + ", username=" + username + ", email=" + email + "]";
	}
	

	
	
    

}
