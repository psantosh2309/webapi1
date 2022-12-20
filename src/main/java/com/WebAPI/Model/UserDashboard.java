package com.WebAPI.Model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="UserDashboard")
public class UserDashboard {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String title ;
    private String designation;
    private String experience;
    private String location;
//    @ManyToOne(targetEntity = LoginModel.class,  
//            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @Access(AccessType.PROPERTY)
//    @JoinColumn(name=" loginmodel_Username")
//    private LoginModel  loginmodel;
	public UserDashboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDashboard(Long id, String title, String designation, String experience, String location) {
		super();
		this.id = id;
		this.title = title;
		this.designation = designation;
		this.experience = experience;
		this.location = location;
		
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

	@Override
	public String toString() {
		return "UserDashboard [id=" + id + ", title=" + title + ", designation=" + designation + ", experience="
				+ experience + ", location=" + location + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getDesignation()=" + getDesignation() + ", getExperience()="
				+ getExperience() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
    
}
