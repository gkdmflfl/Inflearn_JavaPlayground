package firstPjt;

import java.util.Scanner;

public class New8_9dan {

	public static void main(String[] args) {
		 System.out.println("====구구단 N단 출력하기====");
		 System.out.print("2 ~ 9를 입력하세요 : ");
		 Scanner scanner = new Scanner(System.in);
		 int dan = scanner.nextInt();
		
		 while (dan < 2 || dan > 9) {
			 System.out.print("다시 입력하세요 : ");
			 dan = scanner.nextInt();
		 }
		 
		 for(int i = 1; i < 10; i++) {
			 System.out.println(dan + " x " + i + " = " + dan*i);
		 }
			
		 
		 System.out.println("출력되었습니다.");
		 
	}

}
