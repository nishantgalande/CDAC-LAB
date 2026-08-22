import java.util.Scanner;

public class StrLiterals1{
	
	static void checkLiterals(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String str = sc.next();
		System.out.print("Enter String 2: ");
		String str1 = sc.next();
			
		if(str1==str){
			System.out.println("= The string "+ str + " & " + str1 + " pointing to same address in memory!");
		}else{
			System.out.println("= The string "+ str + " & " + str1 + " do not point to same address in memory!");
		}			
		if(str1.equals(str)){
			System.out.println(".equals() The string "+ str + " & " + str1 + " pointing to same address in memory!");
		}
		
	}
	
	public static void main(String[] args){
		StrLiterals1.checkLiterals();
	}
}