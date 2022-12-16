package RoomPractice;

public class sumofAddnum {
	public static void main(String[] args) {
		int num='y';  //121            this is to convert char to number
		int copy=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		String a = sum==copy? "palindrome" : "not palindrome" ;
		System.out.println(a);
	}
}
