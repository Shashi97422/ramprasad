package practiceprog;

public class SecondandThirdMaxWithoutUsingBubbleSort {
public static void main(String[] args) {
	int []a= {30,20,40,10,50};
	int Fmax=0 ,Smax=0 , Tmax=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>Fmax) 
		{
			Tmax=Smax;
			Smax=Fmax;
			Fmax=a[i];
			
		}
		else 
		{
			if(a[i]>Smax)
			{
				Tmax=Smax;
				Smax=a[i];
			}else {
				if(a[i]>Tmax) {
					Tmax=a[i];
				}
			}
		}
	}
	System.out.println("FirstMax======"+Fmax);
	System.out.println("SecondMax======"+Smax);
	System.out.println("Thirdmax======"+Tmax);
}
}
