package Practice;

public class RecroIntreview_Questin {
	public static void main(String[] args) {
		String str="this is recro interview";
		String[] s=str.split(" ");
		for(int i=s.length-1; i>=0; i--){
			System.out.print(s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase()+" ");
		}
		
	}
}
//WAP to reverse the order of words of a string and camelcase each word
//Inout: str = “this is recro interview”
//Output : “Interview Recro Is This”