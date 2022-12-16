package RoomPractice;

import java.util.LinkedHashSet;

public class Removeduplicatecountovels {
	public static void main(String[] args) 
	{

		String s="aeioaoeeu";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				count++;
			
			}
			System.out.println(ch+" "+count);
		}
		System.out.println("Ofter removing duplicate==> "+count);
		
	}
}