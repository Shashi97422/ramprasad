package RoomPractice;

public class findmaxlength {
public static void main(String[] args) {
	String s[]= {"hi", "hello", "one", "four", "killer"};
	int max = s[0].length();
	for (int i = 0; i < s.length; i++) {
		if(max<s[i].length()) {
			max=s[i].length();
		}
	}
	for (int i = 0; i < s.length; i++) {
		
	
	if(max==s[i].length()) {
		System.out.println(s[i]+" ");
	}
}
}
}
