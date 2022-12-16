package tyDrivepracticepkg;

public class SeperateAlphabetNUMandSpec {
	public static void main(String[] args) {
		String s="dfjsjAo5958!@#$";
		String uppercase="";
		String lowercase="";
		String numbers="";
		String specChars="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				uppercase=s.charAt(i)+uppercase;
			}else
				if(s.charAt(i)>='a' && s.charAt(i)<='z') {
					lowercase=s.charAt(i)+lowercase;
				}else
					if(s.charAt(i)>='0' && s.charAt(i)<='9') {
						numbers=numbers+s.charAt(i);
					}
				else {
					specChars=s.charAt(i)+specChars;
				}
		}
		System.out.println(uppercase);
	}

}
