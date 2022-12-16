package RoomPractice;

public class NumPolyrom {
public static void main(String[] args) {
	int no=434;
	int copy=no;
	int rev=0;
	while(no!=0) {
		int rem = no%10;
		rev=(rev*10)+rem;
		no=no/10;
	}
	System.out.println(rev);
	if(rev==copy) {
		System.out.println("No is polydrom");
	}else {
		System.out.println("No is not polydrom");
	}
}
}
