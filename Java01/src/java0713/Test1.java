package java0713;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 거스름돈 구하기
		Scanner scan = new Scanner(System.in);
		int[] coin = {500,100,50,10};
		int money = 0;
		int change = 0;
		
		System.out.print("금액 입력 :");
		money = scan.nextInt();
		
		for(int i=0;i < coin.length;i++) {
			
			if(money > 0) {
				change = money / coin[i];
				money = money % coin[i];
			}else if(money == 0) {
				change = 0;
				
			}
			System.out.println(coin[i]+"원 동전"+change+"개");
			scan.close();
			
			
			

	
	
				
					}
		
				}
				
				
			}



