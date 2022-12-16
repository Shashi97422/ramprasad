package RoomPractice;

import java.util.LinkedHashSet;

public class how {
public static void main(String[] args) {
	String s="welcome to bengaluru and welcome to testyantra";
	String[] sp = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < sp.length; i++) {
		set.add(sp[i]);
	}
	for (String words : set) {
		int count=0;
		for (int i = 0; i < sp.length; i++) {
			if(words.equals(sp[i])) {
				count++;
			}
		}
	}
}
}
