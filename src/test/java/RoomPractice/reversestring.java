package RoomPractice;

public class reversestring {
public static void main(String[] args) {
	String s="mom";
	String rev="";
	for (int i = 0; i < s.length(); i++) {
		rev=rev+s.charAt(i);
	}
	System.out.print(rev);
}
}
