package Practice31102022;

import java.util.Arrays;

import org.testng.Assert;

public class Anagram {
public static void main(String[] args) {
	String name1 = "shashi"; 
	String name2 = "shhasi";
	boolean flag=true;
	
	char[] ch1 = name1.toCharArray();
	char[] ch2 = name2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	flag=Arrays.equals(ch1, ch2);
	if(flag) {
		System.out.println(name1+" "+name2+" "+"are Anogram");
	}else {
		System.out.println(name1+" "+name2+" "+"are not Anogram");
	}
}

}
