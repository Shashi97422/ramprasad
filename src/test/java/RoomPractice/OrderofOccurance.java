package RoomPractice;

import java.util.LinkedHashSet;

public class OrderofOccurance {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,6};
		LinkedHashSet<Integer> set =new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer ind : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++)
			{
				if(ind==a[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ind+" "+count);
			}
		}

	}
}
