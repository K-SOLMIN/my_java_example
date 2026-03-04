package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName() + " : " + person.getAge());
		
		person.setName("민국");
		person.setAge(20);
		person.setNationality("대한민국");
		
		person.sayHello();
		
		person.setName("민국").setAge(20).setNationality("대한민국"); //setter의 return값을 객체로 바꿨을때
		
	}

}
