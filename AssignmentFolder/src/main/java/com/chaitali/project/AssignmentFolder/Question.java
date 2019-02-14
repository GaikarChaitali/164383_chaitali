package com.chaitali.project.AssignmentFolder;

import java.util.*;

public class Question {
	int questionId;
	String question;
	List<String> answerlist;
	Set<String> answerset;
	Map<String, String> answermap;
	public Question() {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerlist = answerlist;
		this.answerset = answerset;
		this.answermap = answermap;
	}
	
	
	
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswerlist() {
		return answerlist;
	}
	public void setAnswerlist(List<String> answerlist) {
		this.answerlist = answerlist;
	}
	public Set<String> getAnswerset() {
		return answerset;
	}
	public void setAnswerset(Set<String> answerset) {
		this.answerset = answerset;
	}
	public Map<String, String> getAnswermap() {
		return answermap;
	}
	public void setAnswermap(Map<String, String> answermap) {
		this.answermap = answermap;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", answerlist=" + answerlist + ", answerset=" + answerset
				+ ", answermap=" + answermap + "]";
	}




}
