package practice123;

import java.util.Date;
import java.util.Random;

public class print1to10usingwhileloop {
	public static void main(String[] args) {
		Date date=new Date();
		String currentdate = date.toString();
		String[] arr = currentdate.split(" ");
		System.out.println(date);
		String yyyy = arr[5], date1=arr[2];
		int mon = date.getMonth()+1;
		
		String formate=date1+"/"+mon+"/"+yyyy;
		System.out.println(formate);
		
	}
	}


