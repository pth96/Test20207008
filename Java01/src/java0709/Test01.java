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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.print("����>");
			
			num = scan.nextInt();
			if(num == 1) {
				System.out.print("���ݾ�>");
				money = scan.nextInt();
				now = money+now;
				System.out.println("�����ܾ���"+now+"�Դϴ�.");
			}else if(num == 3) {
				System.out.println("�ܰ�>���� �ܾ���"+now+"�Դϴ�.");
			}else if(num ==4) {
				run = false;
				System.out.println("���α׷��� ����Ǿ����ϴ�");
			} else if(num == 2 ) {
				System.out.print("��ݾ�>");
				out = scan.nextInt();
			   if(now >= out) {
				now = now - out;
				System.out.println("���ó���� �Ǿ����ϴ�.");
				System.out.println("�����ܾ���"+(now)+"�Դϴ�");
			}else if(out > now) {
			
					System.out.println("�ܰ� �����մϴ�.");
					System.out.println("���� �ܾ���"+now+"�Դϴ�.");
		
				}
			} 
			}
	}
}
		
	

				
				
			
			
			
	

		
	


				

	


