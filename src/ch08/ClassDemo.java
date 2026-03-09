package ch08;

public class ClassDemo {

	public static void main(String[] args) {
		Keyboard k = new Keyboard("Logitech", "L001", 10000);
		
		Class<? extends Keyboard> c = k.getClass();
		
		System.out.println("Class.getName() : " + c.getName());
		System.out.println("Class.getSimpleName() : " + c.getSimpleName());
	}

}
