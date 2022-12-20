package com.WebAPI.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SkillLanguage")
public class SkillLanguageModel {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String skillLangCode;
    private String skillLanguage;
    private String skillImage;
    
    public SkillLanguageModel() {
    
    }

	public SkillLanguageModel(Long id, String skillLangCode, String skillLanguage, String skillImage) {
		super();
		this.id = id;
		this.skillLangCode = skillLangCode;
		this.skillLanguage = skillLanguage;
		this.skillImage = skillImage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillLangCode() {
		return skillLangCode;
	}

	public void setSkillLangCode(String skillLangCode) {
		this.skillLangCode = skillLangCode;
	}

	public String getSkillLanguage() {
		return skillLanguage;
	}

	public void setSkillLanguage(String skillLanguage) {
		this.skillLanguage = skillLanguage;
	}

	public String getSkillImage() {
		return skillImage;
	}

	public void setSkillImage(String skillImage) {
		this.skillImage = skillImage;
	}

	@Override
	public String toString() {
		return "SkillLanguageModel [id=" + id + ", skillLangCode=" + skillLangCode + ", skillLanguage=" + skillLanguage
				+ ", skillImage=" + skillImage + "]";
	}

    
	
}



