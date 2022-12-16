package tyDrivepracticepkg;

import java.util.LinkedHashSet;

public class DuplicateStringRemove {
	public static void main(String[] args) {
		String s="asda79b";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>(); 
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"==>> "+(i+1));
					
				}
			}
		}
	}
}
