package com.my.test;

public class Person {
	private final String name;
	private final int age;
	
	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public static class PersonBuilder {
		private String name;
		private int age;
		
		public PersonBuilder() { }
		
		public static PersonBuilder builder() {
			return new PersonBuilder();
		}
		
		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
}
