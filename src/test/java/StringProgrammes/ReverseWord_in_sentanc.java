package StringProgrammes;

public class ReverseWord_in_sentanc {
	public static void main(String[] args) {
		String s="welcome to bengalore"; //bengalore to welcome
		String[] m = s.split(" ");
		for (int i = 0; i < m.length; i++) {
			String n = m[i];
			String rev="";
			for (int j =n.length()-1; j>=0; j--) {
				rev=rev+n.charAt(j);
			}
		System.out.print(rev+" ");
	}
}
}