package ch06;

public class InheritDemo3 {
	public static void main(String[] args) {
		//자식객체 생성시 부모가 있다면 super()를 통해서 부모객체를 먼저생성후 자식을 생성
		//부모클래스에 만약 매개변수있는 생성자가 있을경우 자동으로 기본생성자를 만들어주지 않기에
		//컴파일 시점에 에러발생
		ColoredBox b = new ColoredBox();
	}
}


class Box{
	public Box() {
		// TODO Auto-generated constructor stub
	}
	
	public Box(String color) {
		System.out.println("부모 생성자");
	}
}

class ColoredBox extends Box {
//	public ColoredBox() {
//		System.out.println("자식 생성자");
//	}
	
//	public ColoredBox(String color) {
//		System.out.println(color + "색 박스가 생성되었습니다.");
//	}
}
