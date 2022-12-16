package Practice31102022;

public class FindMaxLengthofstringFromArrray {
	public static void main(String[] args) {
		String str= "shashi dhar swamy";
		String[] s = str.split(" ");
		int max = s[0].length();
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>max) {
				max=s[i].length();
			}else
				if(s[i].length()==max) {
					max=s[i].length();
					System.out.println(s[i]);
				}
		}
	}
}

