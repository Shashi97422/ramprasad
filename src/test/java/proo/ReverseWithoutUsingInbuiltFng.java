package proo;

public class ReverseWithoutUsingInbuiltFng {
public static void main(String[] args) {
	String str = "Saket Saurav";                     //o/p ==> varuaS tekaS
	String[] st = str.split(" ");
	for (int i = st.length-1; i >=0; i--) {
		//System.out.print(st[i]+" ");
		String tem = st[i]+" ";  //saket
		for (int j = tem.length()-1; j >=0; j--) {
			System.out.print(tem.charAt(j)+"");
		}
	}
}
}
