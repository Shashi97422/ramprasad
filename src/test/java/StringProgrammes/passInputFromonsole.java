package StringProgrammes;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class passInputFromonsole {
	public static void main(String[] args) {
		//String s="welcome to bengaluru and welcome to testyantra";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next(); //for passing dynomic input
		//System.out.println("pass :");
		
		String[] sp = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) {
		set.add(sp[i]);
		}
		for (String word : set) {
			int count=0;
			for (int i = 0; i < sp.length; i++) {
				if(word.equals(sp[i])) {
					count++;
				}
			}
			System.out.println(word+" "+count);
		}
	}
}
