package StringProgrammes;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordingivenString
{         
	public static void main(String[] args) 
	{                    // output : this is test yantra
		String s="this is is test yantra";
		String[] ss = s.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < ss.length; i++) 
		{
			set.add(ss[i]);
		}
		//System.out.println(set);
		for (String str : set) 
		{
			int count = 0;
			for (int i = 0; i < ss.length; i++) 
			{
				if(str.equals(ss[i])) 
				{
					count++;

				}
			}
			/* if(count>1) {
			//	System.out.println(str+" "+count);             //print only duplicate//
			}
			//System.out.println(str+" "+count);               // how many times repeated
			 * 
			 */
			if(count==1) {
				System.out.println(str+" "+count);             //for unique word (one time repeated)
			}
		} 
	}
}
