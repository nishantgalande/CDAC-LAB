import java.util.Scanner;

public class Sum{
	
	void sumOfNum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		int answer = num1 + num2;
		System.out.println("The sum of "+ num1 + " and " + num2 + " is: "+ answer);
	}
	
	public static void main(String[] args){
		
		Sum1.sumOfNum();
	}
}