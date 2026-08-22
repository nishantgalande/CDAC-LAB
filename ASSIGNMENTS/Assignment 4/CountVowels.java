import java.util.Scanner;

public class CountVowels{
	
	static void count(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		int count = 0;
		
		for(int i = str.length()-1;i>=0;i--){
		char alph = str.charAt(i);
			if(alph == 'a' || alph == 'e'|| alph == 'i'|| alph == 'o'|| alph == 'u' ){
				count++;
			}
		}

		System.out.println("Number of vowels in "+ str + " is : " + count);
	}
	
	public static void main(String[] args){
		CountVowels.count();
	}
}