package com.dinesh.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Traveller {

	@Id
	private Long id;
	private String name;
	private char sex;
	private int age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Traveller [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
