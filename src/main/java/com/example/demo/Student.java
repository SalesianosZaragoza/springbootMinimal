package com.example.demo;

public class Student {
private String name;
private String surname;
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [name=" + name + ", surname=" + surname + "]";
}

}
