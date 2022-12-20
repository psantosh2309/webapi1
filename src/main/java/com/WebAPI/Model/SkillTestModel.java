package com.WebAPI.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SkillTest")
public class SkillTestModel {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String skillTest;
    private String experience;
    private Date enddate;
    
    public SkillTestModel() {
    	
    }

	public SkillTestModel(Long id, String skillTest, String experience, Date enddate) {
		super();
		this.id = id;
		this.skillTest = skillTest;
		this.experience = experience;
		this.enddate = enddate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillTest() {
		return skillTest;
	}

	public void setSkillTest(String skillTest) {
		this.skillTest = skillTest;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Override
	public String toString() {
		return "SkillTestModel [id=" + id + ", skillTest=" + skillTest + ", experience=" + experience + ", enddate="
				+ enddate + "]";
	}
   

	
	
	
	
    
	

}
