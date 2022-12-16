package tyDrivepracticepkg;

public class Charactor_Shifting {
public static void main(String[] args) {
	String s="shashi";
	int key1=2;
	int key=key1+2;
	for (int i = key; i < s.length(); i++) {
		System.out.print(s.charAt(i));
	}
	for (int i = 0; i < key; i++) {
		System.out.print(s.charAt(i));
	}
	
	
}
}
