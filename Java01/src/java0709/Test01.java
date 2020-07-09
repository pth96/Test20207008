package java0709;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int money = 0;
		int out = 0;
		int now = 0;
		boolean run = true;
		while(run) {
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("선택>");
			
			num = scan.nextInt();
			if(num == 1) {
				System.out.print("예금액>");
				money = scan.nextInt();
				now = money+now;
				System.out.println("현재잔액은"+now+"입니다.");
			}else if(num == 3) {
				System.out.println("잔고>현재 잔액은"+now+"입니다.");
			}else if(num ==4) {
				run = false;
				System.out.println("프로그램이 종료되었습니다");
			} else if(num == 2 ) {
				System.out.print("출금액>");
				out = scan.nextInt();
			   if(now >= out) {
				now = now - out;
				System.out.println("출금처리가 되었습니다.");
				System.out.println("현재잔액은"+(now)+"입니다");
			}else if(out > now) {
			
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재 잔액은"+now+"입니다.");
		
				}
			} 
			}
	}
}
		
	

				
				
			
			
			
	

		
	


				

	


