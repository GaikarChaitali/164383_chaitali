package com.chaitali.project.AssignmentFolder;

public class School {
	String stream;
	String name;
	
	
	public School() {
		super();
		this.stream = stream;
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "School [stream=" + stream + ", name=" + name + "]";
	}


}
