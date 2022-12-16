package PatternPractice;

public class Dimond {
public static void main(String[] args) {
	int space=4;
	int star=1;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=space; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=star; j++) {
			System.out.print("*");
		}
		System.out.println();
		space--;
		star=star+2;
	}
	int space1=1;
    int	star1=7;
	for (int i = 1; i <=4; i++) {
		for (int j = 1; j <=space1; j++) {
			System.out.print(" ");
		}
		for (int j =1; j <=star1; j++) {
			System.out.print("*");
		}
		System.out.println();
		space1++;
		star1=star1-2;
	}
}
}
