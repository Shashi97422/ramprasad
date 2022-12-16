package Practice22112022;

public class MissingEvenNumber {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[]a={2,4,8,12,16,20};
		for(int i=0; i<a.length-1; i++){
		    int n=a[i+1]-a[i];
		    int count=1;
		    while(n>1){    //if differance is greater than 1 then we undrastand number is missing
		        int num=a[i]+count;
		        if(num%2==0){
		            System.out.print(num+" ");
		        }
		        count++;
		        n--;
		    }
		}
	}
}
