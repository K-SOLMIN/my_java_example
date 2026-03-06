package ch07.exercise;

public class Ex04 {
	public static void main(String[] args) {
		TalkableTest.speak(new Korean());
		TalkableTest.speak(new American());
	}
}

interface Talkable {
	void talk();
}

class TalkableTest {
	static void speak(Talkable talkable) {
		talkable.talk();
	}
}

class Korean implements Talkable{

	@Override
	public void talk() {
		System.out.println("안녕하세요");
	}
	
}

class American implements Talkable{

	@Override
	public void talk() {
		System.out.println("Hello");
	}
	
}