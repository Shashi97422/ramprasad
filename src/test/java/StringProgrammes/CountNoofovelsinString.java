package StringProgrammes;

public class CountNoofovelsinString 
{
	public static void main(String[] args) 
	{
		String s="testyantra";  //3 ovels
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			//int count = 0;
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
			
		}
		System.out.println("no of vowels are ==> "+count);
	}


        /*
	    int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='e' || ch[i]=='e' || ch[i]=='e')
			{
				count++;
			}
		}
		System.out.println("no of vowels are ==> "+count);

	}  */
}

