package java0714;



import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] students = null;
		int maxscore = 0;
		double sum = 0;
		int cho = 0;
		int temp = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------------------------");
			System.out.print("����>");
			cho = scan.nextInt();
			//�л����Է� (�迭ũ������)
			if(cho == 1) {
				System.out.print("�л���>");
				int size = scan.nextInt();
				students = new int[size];
		    //�����Է�
			}else if(cho == 2) {
				for(int i = 0;i<students.length;i++) {
				System.out.print((i+1)+"�� ° �л����� :");
				students[i] =scan.nextInt();
				}
			//��������Ʈ ���
			}else if(cho == 3) {
				for(int j = 0;j<students.length;j++) {
					System.out.println((j+1)+"�� ° �л����� :"+students[j]);
					sum = sum + students[j];//����� ���ϱ����� ����
					
				}
			//��������Ʈ �ְ�����,���,������������
			}else if(cho == 4) {
				
				for(int k=0;k<students.length;k++) {
					
					for(int a=k+1;a<students.length;a++) {
					
					if(students[k]<students[a]) {
						 temp = students[k];
						 students[k] = students[a];
						 students[a]= temp;
					}
					
					 if(maxscore < students[k]) { 
						maxscore = students[k];
									
					}
								
				}
				}System.out.println("�ְ����� : "+maxscore);
				System.out.println("������� : "+Math.round(sum/students.length*100)/100);
				System.out.println("������������");
				for(int k=0; k<students.length;k++) {
				System.out.println(students[k]);
			
				
				}
				//����
			}else if(cho == 5) {
				run = false;
				System.out.println("���α׷�����");
				
			}
		}scan.close();

	}

}
