package tyDrivepracticepkg;

public class FactorialWithoutusingForLoop {
public static int no(int n) {
	if(n==1) 
		return 1; 
	return n*=no(n-1);

}
public static void main(String[] args) {
	 int f = no(5);
	System.out.println(f);
}
}
