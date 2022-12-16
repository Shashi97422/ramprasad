package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(10);
		list.add(25);
		list.add(20);
		list.add(40);
		list.add(100);
		list.add(20);
		list.add(40);
		//System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
	}

