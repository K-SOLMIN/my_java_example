package ch06.exercise;

public class Ex03 {

	public static void main(String[] args) {
		Person person = new Person("길동이", 22);
		Student student = new Student("황진이", 23, "100");
		ForeignStudent foreignStudent = new ForeignStudent("Amy", 30, "200", "U.S.A");
		
		Person[] people = new Person[3];
		
		people[0] = person;
		people[1] = student;
		people[2] = foreignStudent;
		
		for(Person p : people) {
			p.show();
		}
		
	}

}

class Person {
	String name;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
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
	
	void show() {
		System.out.println("[이름 : " + name + ", 나이 : " + age +"]");
	}
	
}

class Student extends Person {
	String grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	void show() {
		System.out.println("[이름 : " + name + ", 나이 : " + age +", 학번 : " + grade + "]");
	}
}

class ForeignStudent extends Student {
	String nationality;
	
	public ForeignStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public ForeignStudent(String name, int age, String grade, String nationality) {
		super(name, age, grade);
		this.nationality = nationality;
	}



	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	void show() {
		System.out.println("[이름 : " + name + ", 나이 : " + age +", 학번 : " + grade + ", 국적 : " + nationality + "]");
	}
}
