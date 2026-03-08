package ch07.exercise;

//public class Ex05 {
//	
//	public static void main(String[] args) {
//		Controller[] c = {new TV(false), new Radio(true);}
// 	}
//}

abstract class Controller {
	boolean power;
	
	public Controller(boolean power) {
		this.power = power;
	}
	
	void show() { };
	
	abstract String getName();
}

class TV extends Controller {

	public TV(boolean result) {
		super(result);
	}
	
	@Override
	String getName() {
		return "TV";
	}
	
}

//class Radio extends Controller {
//
//	@Override
//	String getName() {
//		return "Radio";
//	}
//	
//}
