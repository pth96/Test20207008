package java0709;

import java.util.Scanner;

public class Ex03_ArrayEx {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����Ͽ� 
		// ���� �˾Ƽ� �Է��ϰ�
		// �Էµ� ������ ���հ� ����� ���Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		int ave = 0;
		
		for(int i=0;i<num.length;i++) {
		System.out.println("���� �Է��ϼ���:");
		num[i] = scan.nextInt();
		
		sum = num[i] +sum;
		ave = sum / num.length;
		
		
		}System.out.println("�հ��"+sum+"�Դϴ�");
		System.out.println("�����"+ave+"�Դϴ�.");
		
		
		
		scan.close();

	}

}
