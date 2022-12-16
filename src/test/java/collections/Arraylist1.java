package collections;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(new Emp("shashi", 1000));
		list.add(new Emp("anil", 2000));
		System.out.println(list);
	}


}
