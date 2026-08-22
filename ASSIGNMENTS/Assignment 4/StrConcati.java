import java.util.Scanner;

public class StrConcati{
	
	static void concates(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String str1 = sc.next();
		System.out.print("Enter String 2: ");
		String str2 = sc.next();

		String str3 = str1 + str2;
		if(str3 == str1){
			System.out.println("Is str3 pointing the same object as str1? true");
		}else{
			System.out.println("Is str3 pointing the same object as str1? false");
		}
		
	}
	
	public static void main(String[] args){
		StrConcati.concates();
	}
}