package StringProgrammes;

public class PrintMaxiumLengthOfArray {
public static void main(String[] args) {
	String[] s= {"12","1234","1324545","487877721"};
	String maxLength=s[0];
	for (int i = 0; i < s.length; i++) {
		if(maxLength.length()<s[i].length()) {
			maxLength=s[i];
		}
	}
	for (int i = 0; i < s.length; i++) {
		if(maxLength.length()==s[i].length()) {
			System.out.println(s[i]+" ");
		}
	}
}
}
