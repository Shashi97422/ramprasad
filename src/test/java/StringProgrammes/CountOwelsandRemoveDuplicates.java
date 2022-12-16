package StringProgrammes;

import java.util.LinkedHashSet;

public class CountOwelsandRemoveDuplicates {
public static void main(String[] args) {
	String s="aeiioaoeeu";
	int count=0;
	int count1=0;
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		set.add(ch);
		count1++;
		
	}
	System.out.println(count1);
	//System.out.println(set);
for (Character ch1 : set) {
	if((ch1=='a')||(ch1=='e')||(ch1=='i')||(ch1=='o')||(ch1=='u')) {
		count++;
	}
}
System.out.println(count);
	//System.out.println();
}


}
