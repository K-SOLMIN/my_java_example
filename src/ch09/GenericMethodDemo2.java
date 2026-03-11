package ch09;

import java.util.ArrayList;
import java.util.List;

import ch07.exercise.Line;

public class GenericMethodDemo2 {

	public static void main(String[] args) {
		// a[4]의 값 보다 큰 티켓의 개수 구하는 문제
		
		Ticket[] tickets = {new Ticket(11000), new Ticket(15000), 
								new Ticket(8000), new Ticket(20000), new Ticket(10000)};
		
		Line[] lines = {new Line(11000), new Line(15000), 
							new Line(8000), new Line(20000), new Line(10000)};
		
		System.out.println(countGT(tickets, tickets[4]));
		System.out.println(countGT(lines, lines[4]));
		
		List<? extends Line> list = new ArrayList<>();
		
	}
	
//	static int countGT(Ticket[] ticketArr, Ticket ticket) {
//		int count = 0;
//		
//		for(Ticket t : ticketArr) {
//			if(ticket.compareTo(t) > 0) {
//				count++;
//			};
//		}
//		
//		return count;
//	}
	
	static <T extends Comparable<T>> int countGT(T[] tArr, T t) {
		int count = 0;
		
		for(T v : tArr) {
			if(t.compareTo(v) < 0) {
				count++;
			};
		}
		
		return count;
	}
}

	



class Ticket implements Comparable<Ticket> {
	int price;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Ticket(int price) {
		super();
		this.price = price;
	}

	@Override
	public int compareTo(Ticket ticket) {
		return this.price - ticket.price;
	}
		
}


