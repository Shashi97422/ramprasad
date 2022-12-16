package Practice31102022;

public class StringPolydrom {
	public static void main(String[] args) {
		String s="gadag";
		String copy = s;
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(copy.equals(rev)) {
			System.out.println("polydrom");
		}
	}
	
}
