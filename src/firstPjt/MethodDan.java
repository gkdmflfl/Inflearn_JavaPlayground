package firstPjt;

import java.util.Scanner;

public class MethodDan {
	static Scanner scanner = new Scanner(System.in);

	public static void guguDan(int dan) {
		while (dan < 2 || dan > 9) {
			 System.out.print("�ٽ� �Է��ϼ��� : ");
			 dan = scanner.nextInt();
		 }
		 
		 for(int i = 1; i < 10; i++) {
			 System.out.println(dan + " x " + i + " = " + dan*i);
		 }
			
		 
		 System.out.println("��µǾ����ϴ�.");	
		
	}
	
	public static void main(String[] args) {
		System.out.println("====������ N�� ����ϱ�====");
		 System.out.print("2 ~ 9�� �Է��ϼ��� : ");
		 int dan = scanner.nextInt();

		 guguDan(dan);
		 
	}	

}
