package StringProgrammes;

public class ReverseThegivenwords {
public static void main(String[] args) {
	String str="this is test yantra";
	String[] s = str.split(" ");
	for (int i = s.length-1; i >=0; i--) {
		System.out.print(s[i]+" ");
	}
}
}
