package StringProgrammes;

import java.util.LinkedHashSet;

public class Positionofletters {
	public static void main(String[] args) {
		String s="tester";  //t=1 e=2 s=3 t=4 e=5 r=6
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
for (Character ch : set) {
	for (int i = s.length()-1; i >=0; i--) //reset
	{
		if(ch==s.charAt(i))   //t==reset
			                  //e==reset
			                  //s==reset
			                  //r==reset
		{
			System.out.println(ch+"="+(i+1));
			break;     //to avoid duplicate
		}
	}
}
}
}
