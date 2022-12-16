package Practice31102022;

public class addingelementsoftwoarrey {
	public static void main(String[] args) {
		int []a= {2,4,6};
		int []b= {3,7,9,10};
		int max = a.length;
		if(b.length>max) {
			max=b.length;
			for (int i = 0; i < b.length; i++) {
				try {
					System.out.println(a[i]+b[i]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(b[i]);
				}

			}
		}
	}
}

