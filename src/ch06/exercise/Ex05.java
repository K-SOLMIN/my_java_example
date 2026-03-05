package ch06.exercise;

public class Ex05 {

	public static void main(String[] args) {
		Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
		
		//코드추가
		for(Phone p : phones) {
			if(p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			} else if(p instanceof Smartphone) {
				((Smartphone) p).playGame();
			} else if(p instanceof Phone) {
				p.talk();
			}
		}
	}

}

class Phone {
	protected String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	void talk() {
		System.out.println("통화중");
	}
}

class Telephone extends Phone {
	private String when;
	
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner + "가 부재중이니 " + when + "에 전화요망");
	}
}

class Smartphone extends Phone {
	private String game;
	
	public Smartphone(String name, String game) {
		super(name);
		this.game = game;
	}
	
	void playGame() {
		System.out.println(super.owner + "가 " + game + "게임중");
	}
}
