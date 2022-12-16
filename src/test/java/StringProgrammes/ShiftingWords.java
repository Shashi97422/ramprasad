package StringProgrammes;

public class ShiftingWords {
	public static void main(String[] args) {
		String s="welcome to bengalore"; //bengalore welcome to
		String[] m = s.split(" ");
		 String temp = m[0];
		 m[0]=m[m.length-1];
		 m[m.length-1]=m[1];
		 m[1]=temp;
		 for (int i = 0; i < m.length; i++) {
			System.out.print(m[i]+" ");
		}
		 
		 

	}
}
