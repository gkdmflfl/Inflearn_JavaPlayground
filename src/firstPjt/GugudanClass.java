package firstPjt;

public class GugudanClass {
	
	public GugudanClass() {
		System.out.println("--- 구구단class 생성자 ---");
		System.out.print("2 ~ 9사이의 숫자 입력 : ");
	}
	
	public void calculator(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
	
	
	
}
