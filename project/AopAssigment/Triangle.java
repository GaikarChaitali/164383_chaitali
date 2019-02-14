package com.chaitali.project.AopAssigment;

public class Triangle {
String length;
String height;
public String getLength() {
	return length;
}
public void setLength(String length) {
	this.length = length;
}
public String getHeight() {
	return height;
}
public void setHeight(String height) {
	this.height = height;
}
@Override
public String toString() {
	return "Triangle [length=" + length + ", height=" + height + "]";
}


}
