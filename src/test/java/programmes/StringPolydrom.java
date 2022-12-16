package programmes;

public class StringPolydrom {
public static void main(String[] args) {
	String s="gadag";    //length=5  so 5-1=4
	String rev="";
	String copy=s;
	for (int i = s.length()-1; i >=0; i--) {
		rev=rev+s.charAt(i);
	}
	if(copy.equals(rev)) {
		System.out.println("polydrom");
	}else {
		System.out.println("not");
	}
}
}
