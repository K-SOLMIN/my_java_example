package ch07.exercise;

import java.util.Arrays;
import java.util.Collections;

public class Ex3_4 {
	public static void main(String[] args) {
		Person p1 = new Person("박지성", 40, 175, 68);
		Person p2 = new Person("홍길동", 32, 170, 75);
		Person p3 = new Person("손흥민", 20, 180, 70);
		
		Person[] people = new Person[3];
		people[0] = p3;
		people[1] = p2;
		people[2] = p1;
		
		System.out.println("========== reverse 전 ===========");
		System.out.println(Arrays.toString(people));
		
		Arrays.sort(people);
		
		Collections.reverse(Arrays.asList(people));
		
//		Arrays.sort(people, (pre, next) -> {
//			return next.getAge() - pre.getAge();
//		});
		
		for(Person p : people) {
			System.out.print("??");
			System.out.println(p);
		}
	}
}

class Person implements Comparable {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return String.format("Person [이름=%s, 나이=%d, 키=%d, 몸무게=%d",
				name, age, height, weight);
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Person p) {
			//return p.age - this.age;
			return this.age - p.age;
		}
		return -99999;
	}
}
