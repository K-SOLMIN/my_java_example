package ch07.exercise;

public class Line implements Comparable<Line>{
	private int length;
	
	public Line() {
		// TODO Auto-generated constructor stub
	}

	public Line(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int compareTo(Line line) {
		//generic 설정안했을때
//		if(o instanceof Line l) {
//			if(this.length < l.length) {
//				return -1;
//			}
//			this.length - l.length;
			
//		}
		
		return this.length - line.length;
	}
	
}
