package java0713;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 학점입력후 평점
		Scanner scan = new Scanner(System.in);
		double[][] score = new double[4][2];
		double sum = 0;
		int count = 0;
		System.out.println("성적을 입력하세요");
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print((i+1)+"학년"+(j+1)+"학기 :");
				score[i][j] = scan.nextDouble();
				count++;
				sum = sum + score[i][j];
				
				
				
			}
			
		}System.out.println("총합"+sum);
		System.out.println("평균 :"+(sum/count));
		// 평균 다른방법 (int avg = sum / (score.length * score[0].length);
		scan.close();

	}

}

	


