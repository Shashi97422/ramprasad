package StringProgrammes;

public class RemoveAfromyourNameandreverse 
{
	public static void main(String[] args) 
	{
		String s="shashidharswamy";
	
		for (int i = s.length()-1; i>=0; i--) 
		{
			if(s.charAt(i)!='a') 
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
