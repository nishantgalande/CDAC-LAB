import java.util.Scanner;

public class Factorial{
	
	static void calculate(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int ans = 1;
		
		while(num>=1){
			ans = ans*num;
			num--;
		}	
		
		System.out.println("Factorial is : "ans);
	}
	public static void main(String[] args){
		Factorial.calculate();
	}
}