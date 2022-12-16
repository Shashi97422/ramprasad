package PatternPractice;

public class DimondHalf {
public static void main(String[] args) {
	int star=1;
	int space=4;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=space; j++) {
			System.out.print("  ");
		}
		for (int j = 1; j <=star; j++) {
			System.out.print("* ");
		}
		System.out.println();
		star=star+1;
		space--;
	}
	int star1=4;
	int space1=1;
	for (int i = 1; i <=4; i++) {
		for (int j = 1; j <=space1; j++) {
			System.out.print("  ");
		}
		for (int j = 1; j <=star1; j++) {
			System.out.print("* ");
		}
		System.out.println();
		space1++;
		star1--;
	}
}
}
