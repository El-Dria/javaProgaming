package week10;

public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}}; //4년동안 받은 학점을 배열로 만듬
		double sum = 0; //변수선언
		for(int year=0; year<score.length; year++) {
			for(int term = 0; term<score[year].length; term++) {
				sum += score[year][term];
			} // year에 학년별로 반복, term에는 학기별로 반복 sum은 그 모든 값을 더한다.
		}
		int n = score.length; // 
		int m = score[0].length;
		System.out.println(n);
		System.out.println(m);
		System.out.println("4년 전체 평균은 " + sum/(n*m));
		
	}
}