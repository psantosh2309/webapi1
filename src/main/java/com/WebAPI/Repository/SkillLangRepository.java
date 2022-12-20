package com.WebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebAPI.Model.LoginModel;
import com.WebAPI.Model.SkillLanguageModel;

public interface SkillLangRepository extends JpaRepository<SkillLanguageModel,Long>{

}
