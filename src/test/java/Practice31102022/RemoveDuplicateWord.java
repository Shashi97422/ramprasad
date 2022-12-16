package Practice31102022;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord
{
	public static void main(String[] args)
	{
		String s= "welcome to bengalore and welcome to testyantra";
		String[] m = s.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < m.length; i++) {
			set.add(m[i]);
		}
		//System.out.println(set);
		for (String word : set) {
			int count=0;
			for (int i = 0; i < m.length; i++) {
				if(word.equals(m[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(word+" "+count);
			}
			
		}

	}
}
