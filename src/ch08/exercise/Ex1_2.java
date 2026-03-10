package ch08.exercise;

import java.util.Objects;

public class Ex1_2 {
	public static void main(String[] args) {
		Person p1 = new Person("111111", "홍길동");
		Person p2 = new Person("111111", "손흥민");
		Person p3 = new Person("123456", "손흥민");
		
		if(p1.equals(p2)) System.out.println("같은 사람이다.");
		else System.out.println("다른 사람이다.");
		
		if(p2.equals(p3)) System.out.println("같은 사람이다.");
		else System.out.println("다른 사람이다.");
		
		
	}
}

class Person {
	private String name;
	private String idenNumber;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String idenNumber) {
		super();
		this.name = name;
		this.idenNumber = idenNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdenNumber() {
		return idenNumber;
	}

	public void setIdenNumber(String idenNumber) {
		this.idenNumber = idenNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idenNumber, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(idenNumber, other.idenNumber) && Objects.equals(name, other.name);
	}
	
	
	
	
}
