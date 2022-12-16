package InternetProgrammes;

import java.util.LinkedHashSet;

public class MaximumLengthOfnumber {
public static void main(String[] args) {
	String s="welcome to bengaluru and welcome to testyantra";
	String[] m = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < m.length; i++) {
		set.add(m[i]);
	}
	for (String word : set) {
		int count=0;
		for (int i = 0; i < m.length; i++) {
			if(m[i].equals(word)) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(word+" "+count);
		}
	}
}
}
