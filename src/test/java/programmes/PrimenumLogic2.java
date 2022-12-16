package programmes;

public class PrimenumLogic2 {
public static void main(String[] args) 
{
//int a[]= {1,2,3,4,5,6,7,8,9,10,11};
	int n=5;
	boolean flag = true;
	for (int i = 2; i <n; i++) {
		if(n%i==0) {
			flag=false;
			break;
		}
	}
if(flag==true) {
	System.out.println("prime");
}else {
	System.out.println("not");
}
}
}
