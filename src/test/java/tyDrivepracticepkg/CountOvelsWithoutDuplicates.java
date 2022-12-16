package tyDrivepracticepkg;

import java.util.LinkedHashSet;

public class CountOvelsWithoutDuplicates
{
	public static void main(String[] args) 
	{
		String s="ajduidndoksoosdkvklu";
		int count=0;

		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			{
				set.add(s.charAt(i));
			}
		}
		for (Character ch : set) {
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}
	

}