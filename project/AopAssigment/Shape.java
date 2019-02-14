package com.chaitali.project.AopAssigment;

public class Shape {
	int value1;
Triangle triangle;


public int getValue1() {
	return value1;
}

public void setValue1(int value1) {
	this.value1 = value1;
}

public Triangle getTriangle() {
	return triangle;
}

public void setTriangle(Triangle triangle) {
	this.triangle = triangle;
}

@Override
public String toString() {
	return "Shape [value=" + value1 + ", triangle=" + triangle + "]";
}


}
