package StringProgrammes;

public class PrintUniqueCharactorWithoutUsingCollection {
	public static void main(String[] args) {
		String s="indnia";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			//int count=0;
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count++;
					break;
				}
			}
			if(count==1) {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}
