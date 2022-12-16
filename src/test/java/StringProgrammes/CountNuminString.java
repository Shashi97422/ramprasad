
package StringProgrammes;

public class CountNuminString
{
public static void main(String[] args) 
{
	String s="a12bd11";                             //output: 12+11=23
	int tsum=0;  //
	int sum=0;
	for (int i = 0; i < s.length(); i++) 
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int n = s.charAt(i)-48;  
			tsum=tsum*10+n;  //11
			
		}else {  //0+12
			sum=sum+tsum;
			tsum=0; //12
		}
	}  //12+11
	//sum=sum+tsum;
	System.out.println(sum);
}
}
