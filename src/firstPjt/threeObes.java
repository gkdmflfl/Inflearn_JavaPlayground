package firstPjt;

import java.util.Scanner;

public class threeObes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("�Է��Ͻÿ�.");
		a = scanner.nextInt();
		
		int count3 = 0;
	
		for(int i = 1; i <= a;i++) {
			if(i%3 == 0)
				count3++;
		}System.out.println("3�� ��� ���� : " + count3);
	}

}
