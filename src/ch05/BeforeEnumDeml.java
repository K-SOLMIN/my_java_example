package ch05;

public class BeforeEnumDeml {
	public static void main(String[] args) {
		final int MALE = 0;
		final int FEMALE = 1;
		
		final int EAST = 0;
		final int WEST = 1;
		
		System.out.println(Direction.EAST);
		
		Person person = new Person();
		person.age = 20;
		person.gender = Gender.MALE; //toString overriding
		
		if(person.gender == Gender.MALE) {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
		
		System.out.println(Gender.MALE.compareTo(Gender.FEMALE));
		System.out.println(person.gender); //toString을 호출한다.
		
		//.ordinal() == enum클래스에 열거된 순서, .name() ==  MALE("male") 이면 MALE출력
		System.out.println("ordinal : " + person.gender.ordinal() 
								+ ", name : " + person.gender.name());
		
		
	}
}

class Person {
	//변수
	int age;
	Gender gender; // 0 : Male, 1 : Female
}

//enum은 주소를 가지고 method area에 constant pool 에 올라간다. static변수처럼 사용
//즉 객체를 만들지 않고 사용이 가능하다.
// == 연산은 가능하지만 대소비교는 불가능.
//ENUM.compareTo는 가능하다.(사전적정의의 크냐 작냐는가능..)
enum Gender {
	MALE("Man"), FEMALE("Woman");
	//필드
	String gender;
	
	//생성자
	Gender(String gender) {
		this.gender = gender;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "나는 " + gender + "입니다.";
	}
}

enum Direction {
	EAST, WEST, SOUTH, NORTH
}