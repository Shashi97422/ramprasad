package StringProgrammes;

import java.util.LinkedHashSet;

public class ReverseStringExam 
{
	public static void main(String[] args) 
	
	{
String [] s= {"java","mava","java"};
LinkedHashSet<String>set=new LinkedHashSet<>();

for (int i = 0; i < s.length; i++) 
{
	set.add(s[i]);
	
}

System.out.print(set);
	}
}
