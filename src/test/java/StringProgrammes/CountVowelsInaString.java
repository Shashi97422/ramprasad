package StringProgrammes;

public class CountVowelsInaString {
	public static void main(String[] args) {
		String s="aeiiou";
		
		int count=0;
		
		//By using String
		for (int i = 0; i < s.length(); i++) {
			//int count=0;
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				count++;
			}

		}
		System.out.println(count);
		}
		//by using tocharArray
		
		/*char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')) {
				count++;
			}
				
			
		}
		System.out.println("no of vowels ==> "+count);
	} */
}

