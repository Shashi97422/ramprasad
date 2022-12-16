package RoomPractice;

public class reverse {
public static void main(String[] args) {
	String str="this is test yantra";
	String[] s = str.split(" ");
	for (int i = 0; i < s.length; i++) {
		String k = s[i];
		String rev="";
		for (int j = k.length()-1; j >=0; j--) {
			System.out.print(k.charAt(j));
		}
		System.out.print(" ");
	}
}
}
