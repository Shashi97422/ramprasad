package tyDrivepracticepkg;

public class ShiftingCharactorinString {
public static void main(String[] args) {
	String s="shashi";
	char[] c = s.toCharArray();
	for (int i = 4; i <c.length; i++) {
		System.out.print(c[i]);
	}
	for (int i = 0; i < 4; i++) {
		System.out.print(c[i]);
	}

}
}
