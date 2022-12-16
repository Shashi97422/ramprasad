package StringProgrammes;

public class ReverseTheWordsInString {
	public static void main(String[] args) {
		String str="this is test yantra";
		String[] s = str.split(" ");
		/* for (int i = 0; i < s.length; i++) {
			 {
				String ss = s[i];  //this
				String rev = "";
				for (int k = ss.length()-1; k >=0; k--) 
				{
					rev=rev+ss.charAt(k);
				}
				System.out.print(rev+" ");
			}
		} */
		for (int i = 0; i < s.length; i++) {
			{
				String ss = s[i];
				for (int j = ss.length()-1; j >=0; j--) {
					System.out.print(ss.charAt(j));
				}
				System.out.print(" ");
			}
		}
	}
}
