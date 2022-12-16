package RoomPractice;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class NoaOfTimesOccuranceOfCharactor {
	public static void main(String[] args) {
		//String s="shashidhar";
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		for (Character letters : set) {

			int count = 0;
			for (int i = 0; i < ch.length; i++) {	
				if(s.charAt(i)==letters) {
					count++;
				}


			}
			System.out.println(letters+" "+count);
		}
	}
}
