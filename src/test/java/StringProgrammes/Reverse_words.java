package StringProgrammes;

public class Reverse_words {
public static void main(String[] args) {
	String s="Hi World Bye";
     String[] sr = s.split(" ");
     for (int i = sr.length-1; i >=0; i--) {
		System.out.print(sr[i]+" ");
	}
}
}
