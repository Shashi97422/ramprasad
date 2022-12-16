package tyDrivepracticepkg;

public class ShiftingTheWords {
public static void main(String[] args) {
	String s="welcome to badami to bengalore"; 
	String[] m = s.split(" ");
	int max = m[0].length();
	for (int i = 0; i < m.length; i++) {
		if(m[i].length()<max) {
			max=m[i].length();
		}
	}
	for (int i = 0; i < m.length; i++) {
		if(m[i].length()==max) {
			System.out.println(m[i]);
		}
	}
}
}
