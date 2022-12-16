package StringProgrammes;

import java.util.LinkedHashSet;

public class Noofoccuranceofchar {
	public static void main(String[] args) {
		String s="shashidharswamy";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)==ch)
				{
					count++;
				}
				
			}
			if(count>0) {    //need to for unique charactor
				System.out.println(ch+" "+count);
			}
		}
		

	}
}
