package com.WebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.WebAPI.Model.SkillTestModel;

public interface AssessmentRepository extends JpaRepository<SkillTestModel,Long> {

}


