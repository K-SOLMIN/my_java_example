package ch04;

public class Cat {//가변객체-->불변객체
	//변수
	private final String name;

	//생성자
	public Cat(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	//접근자, 설정자
	
}
