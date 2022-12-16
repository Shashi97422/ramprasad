package Practice31102022;

public class Swap2strings {
	public static void main(String[] args) {
		String s="shashi";
		String p="savita";

		s=s+p;
		p=s.substring(0, 6);
		s=s.substring(6, 12);


		System.out.println("s ==>"+s);
		System.out.println("p ==>"+p);
	}
}

