package tyDrivepracticepkg;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordFroMsentence {
	public static void main(String[] args) {
		String s="welcome to bngalaru and welcome to test yantra ";
		String[] m = s.split(" ");
		LinkedHashSet<String>set =new LinkedHashSet<String>();
		for (int i = 0; i < m.length; i++) {
			set.add(m[i]);
		}
		for (String word : set) {
			for (int i = 0; i < m.length; i++) {
				if(word.equals(m[i])) {
					System.out.println(word+" "+(i+1));
					break;
				}

			}
		}
	}
}
