package Practice22112022;

public class reverseAlternativeWords {
public static void main(String[] args) {
	String s="hello guys good morning";
	String[] k = s.split(" ");
	for (int i = 0; i < k.length; i++) {
		String f = k[i]+" ";
		if((i+1)%2==0) {
			for (int j = f.length()-1; j>=0; j--) {
				System.out.print(f.charAt(j));
			}
		}else {
			System.out.print(k[i]+" ");
		}
	}
}
}
