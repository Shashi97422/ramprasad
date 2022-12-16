package tyDrivepracticepkg;

public class AddNumFromString {
public static void main(String[] args) {
	int [] a={23,123,12235,18,4};
	int max = Integer.toString(a[0]).length();
	for (int i = 0; i < a.length; i++) {
		if(Integer.toString(a[i]).length()>max) {
			max=Integer.toString(a[i]).length();
		}
	}
	for (int i = 0; i < a.length; i++) {
		if(Integer.toString(a[i]).length()==max) {
			System.out.println(a[i]);
		}
	}
}
}
