package com.my.noritor;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		
		if(obj instanceof Person p) {
			if(this.name.equals(p.getName()) &&
					this.age == p.age) {
				return true;
			} else {
				return false;
			}		
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age;
	}
}
