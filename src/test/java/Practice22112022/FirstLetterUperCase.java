package Practice22112022;

public class FirstLetterUperCase {
public static void main(String[] args) {
	String s="venkat is going";
    String[] m = s.split(" ");
    for (int i = m.length-1; i>=0; i--) {
   	for (int j = 0; j < m[i].length(); j++) {
  		int ch=0;
    		if(j==0) {
		ch = m[i].charAt(j);
        System.out.println((char)ch);
    	System.out.println(ch);
    	System.out.println((char)(ch-32));
    	System.out.println(ch-32);
		//System.out.print((char)ch);
//    		}else {
//			System.out.print(m[i].charAt(j));
//    		}
//    		}
//    	System.out.print(" ");
    	
    	//System.out.print(m[i].substring(0,1).toUpperCase()+m[i].substring(1)+" ");
		}
	}
    }
}}


