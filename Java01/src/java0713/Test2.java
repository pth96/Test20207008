package java0713;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// �����Է��� ����
		Scanner scan = new Scanner(System.in);
		double[][] score = new double[4][2];
		double sum = 0;
		int count = 0;
		System.out.println("������ �Է��ϼ���");
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print((i+1)+"�г�"+(j+1)+"�б� :");
				score[i][j] = scan.nextDouble();
				count++;
				sum = sum + score[i][j];
				
				
				
			}
			
		}System.out.println("����"+sum);
		System.out.println("��� :"+(sum/count));
		// ��� �ٸ���� (int avg = sum / (score.length * score[0].length);
		scan.close();

	}

}

	


