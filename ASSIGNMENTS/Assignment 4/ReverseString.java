import java.util.Scanner;

public class ReverseString{
	
	static void reverse(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		String str1 = "";
			
		for(int i = str.length()-1;i>=0;i--){
			str1 = str1+str.charAt(i);
		}

		System.out.println(str1);
	}
	
	public static void main(String[] args){
		ReverseString.reverse();
	}
}