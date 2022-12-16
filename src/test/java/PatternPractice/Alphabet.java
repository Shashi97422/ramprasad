package PatternPractice;

public class Alphabet {
	public static void main(String[] args) {
		char s='A';
		for (int i = 1; i <=26; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(s++ +" ");
			}
			System.out.println();
		}
	}
}
