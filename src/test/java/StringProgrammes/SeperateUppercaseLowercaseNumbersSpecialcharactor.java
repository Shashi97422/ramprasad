package StringProgrammes;

public class SeperateUppercaseLowercaseNumbersSpecialcharactor {
	public static void main(String[] args) {
		String s= "DJjkfsd$6784628%#$%^";
		String uc = "";
		String lc = "";
		String num="";
		String sc = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			/* if((ch>=65)&&(ch<=90)) {
			uc=uc+ch;
		}
		if((ch>=91)&&(ch<=122)) {
			lc=lc+ch;
		}
		if((ch>=0)&&(ch<=9)) {
			n=n+ch;
		}
		else {
			sc=sc+sc;
		}
	}
	System.out.println(uc+lc+n+sc+" ");  */



			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				uc=uc+ch;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') 
			{
				lc=lc+ch;
			}else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+ch;
			}else {
				sc=sc+ch;
			}
		}
		System.out.println(uc+" "+lc+" "+num+" "+sc);
	}
}
