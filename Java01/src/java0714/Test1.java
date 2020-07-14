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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택>");
			cho = scan.nextInt();
			//학생수입력 (배열크기지정)
			if(cho == 1) {
				System.out.print("학생수>");
				int size = scan.nextInt();
				students = new int[size];
		    //점수입력
			}else if(cho == 2) {
				for(int i = 0;i<students.length;i++) {
				System.out.print((i+1)+"번 째 학생점수 :");
				students[i] =scan.nextInt();
				}
			//점수리스트 출력
			}else if(cho == 3) {
				for(int j = 0;j<students.length;j++) {
					System.out.println((j+1)+"번 째 학생점수 :"+students[j]);
					sum = sum + students[j];//평균을 구하기위한 총합
					
				}
			//점수리스트 최고점수,평균,내림차순정렬
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
				}System.out.println("최고점수 : "+maxscore);
				System.out.println("평균점수 : "+Math.round(sum/students.length*100)/100);
				System.out.println("내림차순정렬");
				for(int k=0; k<students.length;k++) {
				System.out.println(students[k]);
			
				
				}
				//종료
			}else if(cho == 5) {
				run = false;
				System.out.println("프로그램종료");
				
			}
		}scan.close();

	}

}
