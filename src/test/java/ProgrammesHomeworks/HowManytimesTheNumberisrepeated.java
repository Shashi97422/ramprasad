package ProgrammesHomeworks;

import java.util.LinkedHashSet;

public class HowManytimesTheNumberisrepeated {
	public static void main(String[] args) {
		int[] a= {4,1,1,2,2,3};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer inte : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(inte==a[i]) {
					count++;
				}
			}
			System.out.println(inte+" is no of times repeated==> "+count);
		}
		
	}
	
}
