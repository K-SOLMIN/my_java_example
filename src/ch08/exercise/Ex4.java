package ch08.exercise;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println(new Dice().roll());
	}
}

class Dice {
	public int roll() {
		int result = 0;
		Random random = new Random();
		
		result = random.nextInt(1, 7);
		
		return result;
	}
}
