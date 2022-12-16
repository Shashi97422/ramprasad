package StringProgrammes;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class NumberofOccuranceofchar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s = sc.next();
	//String s="aaeiioooou";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for (Character ch : set) {
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch+" "+count);
	}
	
}
}
