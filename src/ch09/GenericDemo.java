package ch09;

public class GenericDemo {

	public static void main(String[] args) {
		Cup<Beer> cup = new Cup<>();
		
		cup.setBeverage(new Beer());
		
		Beer beverage = cup.getBeverage();
		Beer beer = (Beer) beverage;
		
		beer.drink();
		
		Cup<Boricha> borichaCup = new Cup<>();
		
		borichaCup.setBeverage(new Boricha());
		Boricha boricha = borichaCup.getBeverage();
		
		boricha.drink();
//		cup.setBeverage(new Boricha());
//		
//		beverage = cup.getBeverage();
//		Boricha boricha = (Boricha) beverage;
//		
//		boricha.drink();
		
		genericMethod(100);
		genericMethod("hello");
		
	}
	
	public static <T> void genericMethod(T data) {
		System.out.println(data);
	}

}

class Cup<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T t) {
		this.beverage = t;
	}
	
	public <T> void any(T any) {
		
	}
}

class Beverage {
	void drink() {
		System.out.println("음료수를 마신다.");
	}
}

class Boricha extends Beverage {
	@Override
	void drink() {
		System.out.println("drink boricha");
	}
}

class Beer extends Beverage {
	@Override
	void drink() {
		System.out.println("drink beer");
	}
}
