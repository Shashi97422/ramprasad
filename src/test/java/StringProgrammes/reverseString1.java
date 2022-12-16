package StringProgrammes;

public class reverseString1 {
	public static void main(String[] args) {
String s="mom";
String rev="";
for (int i = s.length()-1; i >=0; i--) {
	rev=rev+s.charAt(i);
}
if(rev.equals(s)) {
	System.out.println("It is polydrom");
}else {
	System.out.println("its not a polydrom");
}
	}
}
