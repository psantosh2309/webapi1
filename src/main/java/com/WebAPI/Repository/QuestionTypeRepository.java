package com.WebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WebAPI.Model.QuestionTypeModel;


@Repository
public interface QuestionTypeRepository extends JpaRepository<QuestionTypeModel,Long> {

}
