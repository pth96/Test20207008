package java0713;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// �Ž����� ���ϱ�
		Scanner scan = new Scanner(System.in);
		int[] coin = {500,100,50,10};
		int money = 0;
		int change = 0;
		
		System.out.print("�ݾ� �Է� :");
		money = scan.nextInt();
		
		for(int i=0;i < coin.length;i++) {
			
			if(money > 0) {
				change = money / coin[i];
				money = money % coin[i];
			}else if(money == 0) {
				change = 0;
				
			}
			System.out.println(coin[i]+"�� ����"+change+"��");
			scan.close();
			
			
			

	
	
				
					}
		
				}
				
				
			}



