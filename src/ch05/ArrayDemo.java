package ch05;

public class ArrayDemo {
	
	public static void main(String[] args) {
		//요구사항 - 10명의 학생의 점수를 각각 저장하고 합계와 평균을 구해주세요
		//변수에는 정해진 크기의 데이터를 한개 담아놓을 수 있다.
		int score1 = 100;
		int score2 = 90;
		int score3 = 85;
		
		int total = score1 + score2 + score3;
		double avg = (double) total / 3;
		
		String msg = String.format("합계는 %d 평균 점수는 %.1f 입니다.", total, avg);
		System.out.println(msg);
		
		//정해진 크기의 5개의 데이터를 담으려면 ???? --> 배열
		int[] scores = {100, 90, 80, 95, 90, 80, 85, 70, 60, 100};
		total = 0;
		
		System.out.println("scores배열의 길이 : " + scores.length);
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
		msg = String.format("합계는 %d 평균 점수는 %.2f 입니다.", total, total / (double)scores.length);
		System.out.println(msg);
	}
}
