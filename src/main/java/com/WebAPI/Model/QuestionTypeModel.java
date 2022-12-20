package com.WebAPI.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="QuestionType")
public class QuestionTypeModel {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="QuestionType")
    private String QuestionType;
	
	@Column(name="ProblemStatement")
    private String ProblemStatement;
    
	
//	@OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="pk_id",referencedColumnName = "id")
//	private List<QuestionTypeChoiceModel> ChoiceForm = new ArrayList<>();
    
    public QuestionTypeModel() {
    	
    }
    
    

	public QuestionTypeModel(String questionType, String problemStatement) {
		super();
		QuestionType = questionType;
		ProblemStatement = problemStatement;
//		ChoiceForm = choiceForm;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionType() {
		return QuestionType;
	}

	public void setQuestionType(String questionType) {
		QuestionType = questionType;
	}

	public String getProblemStatement() {
		return ProblemStatement;
	}

	public void setProblemStatement(String problemStatement) {
		ProblemStatement = problemStatement;
	}

//	public List<QuestionTypeChoiceModel> getChoiceForm() {
//		return ChoiceForm;
//	}
//
//	public void setChoiceForm(List<QuestionTypeChoiceModel> choiceForm) {
//		ChoiceForm = choiceForm;
//	}


//
//	@Override
//	public String toString() {
//		return "QuestionTypeModel [id=" + id + ", QuestionType=" + QuestionType + ", ProblemStatement="
//				+ ProblemStatement + ", ChoiceForm=" + ChoiceForm + ", getId()=" + getId() + ", getQuestionType()="
//				+ getQuestionType() + ", getProblemStatement()=" + getProblemStatement() + ", getChoiceForm()="
//				+ getChoiceForm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
	//}
	
	
    

	
	
   
    

	
}
