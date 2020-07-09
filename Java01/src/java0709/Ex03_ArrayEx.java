package java0709;

import java.util.Scanner;

public class Ex03_ArrayEx {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하여 
		// 값을 알아서 입력하고
		// 입력된 값들의 총합과 평균을 구하시오.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		int ave = 0;
		
		for(int i=0;i<num.length;i++) {
		System.out.println("수를 입력하세요:");
		num[i] = scan.nextInt();
		
		sum = num[i] +sum;
		ave = sum / num.length;
		
		
		}System.out.println("합계는"+sum+"입니다");
		System.out.println("평균은"+ave+"입니다.");
		
		
		
		scan.close();

	}

}
