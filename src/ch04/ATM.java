package ch04;

public class ATM {
	//필드는 객체 생성시 타입에 맞게 null, 0, false..등으로 초기화된다.
	public String location;
	public String managedBy;
	
	//생성자 - 기본생성자, default생성자는 컴파일러가 자동으로 코드를 생성해준다.
	//인스턴스 변수의 값을 원하는 값으로 초기화해주는 작업을한다.
	public ATM() {
		location = "오리역";
		managedBy = "연구원";
	}
	
	public void identifies() {
		
	}
	
	public void transactions() {
		
	}
}
