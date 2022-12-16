package RoomPractice;

import java.util.Scanner;

public class Find_Even_Odd_WithoutUsing_If_Statement {
	public static void main(String[] args)
    {
         
        String[] arr = {"Even", "Odd"};
         
        Scanner s = new Scanner(System.in);
         
        System.out.print("Enter the number: ");
        int no = s.nextInt();
 
        System.out.println(arr[no%2]);
    }
}

