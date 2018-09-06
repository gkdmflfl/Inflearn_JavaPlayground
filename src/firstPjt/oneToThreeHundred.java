package firstPjt;

public class oneToThreeHundred {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			if(num%2 == 0)
				sum+=num;
			num++;
		}System.out.println("sum : " + sum);
		
		for(int i = 101; i < 200; i++) {
			if(num%2 == 0)
				sum+=num;
			num++;
		}System.out.println("sum : " + sum);
		
		for(int i = 201; i < 300; i++) {
			if(num%2 == 0)
				sum+=num;
			num++;
		}System.out.println("sum : " + sum);
	}

}
