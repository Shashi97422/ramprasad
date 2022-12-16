package Practice31102022;

public class Stringfunction {
public static void main(String[] args) {
	String s="welcome to expleo";
	String[] a = s.split(" ");
	for (int i = a.length-1; i >=0; i--) {
		System.out.print(a[i]+" ");
	}

}
}
