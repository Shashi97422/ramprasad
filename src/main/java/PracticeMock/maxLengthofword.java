package PracticeMock;

public class maxLengthofword {
	public static void main(String[] args) {
		String s="god better best";
		String[] m = s.split(" ");
		int maxlength = m[0].length();
		for (int i = 0; i < m.length; i++) {
			if(m[i].length()>maxlength) {
				maxlength=m[i].length();
			}
		}
		for (int i = 0; i < m.length; i++) {
			if(m[i].length()==maxlength) {
				maxlength=m[i].length();
				System.out.println(m[i]);
			}
		}

	}
}
