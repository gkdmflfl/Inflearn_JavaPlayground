package firstPjt;

import java.awt.List;
import java.util.ArrayList;

public class ListTry {

	public static void main(String[] args) {
		List list = new List(3, false);
		list.add("과학");
		list.add("수학");
		list.add("물리");
		list.add("some");
		
		System.out.println(list.getItemCount());
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(100);
		list2.add(80);
		list2.add(90);
		list2.add(75);
		
		System.out.println(list2.size());
		System.out.println(list2.contains(90));
		System.out.println(list2.remove(0));
		System.out.println(list2.get(0));
		
	}

}
