package firstPjt;

import java.util.Scanner;

public class threeObes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("입력하시오.");
		a = scanner.nextInt();
		
		int count3 = 0;
	
		for(int i = 1; i <= a;i++) {
			if(i%3 == 0)
				count3++;
		}System.out.println("3의 배수 갯수 : " + count3);
	}

}
