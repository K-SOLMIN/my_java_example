package ch04;

public class Person {
	//필드(캡슐화되어 있는 경우에는 접근자(getter)와 설정자(setter)를 생성
	private String name;
	private int age;
	private String nationality;
	
	
	//생성자
	
	//메소드
	public String getName() {
		return name;
	}
	
	//setter메소드의 return을 Person타입으로 하고 return this를 하면 이어서 쓸 수 있다.
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	
	public int getAge() {
		return age;
	}
	
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕, 나는 " + nationality + "사람이고, '" + name + "'이고 " + age + "살이야");
	}
}
