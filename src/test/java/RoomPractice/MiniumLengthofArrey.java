package RoomPractice;

public class MiniumLengthofArrey {
public static void main(String[] args) {
	String s[]= {"hello","h","byby","hel"};
	int min=s[0].length();
	for (int i = 0; i < s.length; i++) {
		if(s[0].length()>s[i].length()) {
			min=s[i].length();
		}
	}
	for (int i = 0; i < s.length; i++) {
		if(s[i].length()==min) {
			System.out.println(s[i]);
		}
	}
	
}
}
