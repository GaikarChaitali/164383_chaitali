package com.chaitali.project.AssignmentFolder;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String sName;
	private int rollNo;
	private String stream;

	
	@Resource(name="school")
	School school;
	
	
	
	public Student() {
		super();
		this.sName = sName;
		this.rollNo = rollNo;
		this.stream = stream;
		this.school = school;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getRollNo() {
		return rollNo;
	}
    @Required
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", rollNo=" + rollNo + ", stream="
				+ stream + ", school=" + school + "]";
	}

	

	

}
