import java.util.Scanner;

public class Palindrome{
	
	static void check(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		String str1 = "";
			
		for(int i = str.length()-1;i>=0;i--){
			str1 = str1+str.charAt(i);
		}
		if(str1.equals(str)){
			System.out.println("The string "+ str + " is palindrome !");
		}
		
	}
	
	public static void main(String[] args){
		Palindrome.check();
	}
}