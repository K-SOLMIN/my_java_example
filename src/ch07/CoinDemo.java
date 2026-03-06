package ch07;

public class CoinDemo {
	
	public static void main(String[] args) {
		System.out.println("Dime 은 " + Coin.DIME + " 센트입니다.");
//		Coin coin = new Coin();//인터페이스 객체생성 불가능
	}
}

interface Coin {
	public static final int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}
