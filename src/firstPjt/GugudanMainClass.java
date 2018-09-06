package firstPjt;

import java.util.Scanner;

public class GugudanMainClass {

	public static void main(String[] args) {
		GugudanClass gugu = new GugudanClass();
		Scanner scanner = new Scanner(System.in);
		
		int danNum = scanner.nextInt();
		
		gugu.calculator(danNum);
		

	}

}
