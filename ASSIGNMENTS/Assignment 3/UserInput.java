import java.util.Scanner;

public class UserInput{
	
	static void askForPositiveNumbers(){
		Scanner sc = new Scanner(System.in);
		int num1;
		
		do{
			System.out.print("Enter the number: ");
			num1 = sc.nextInt();
		}
		while(num1<0);
		
		System.out.println("The number is "+ num1);
		
	}

	public static void main(String[] args){
		UserInput.askForPositiveNumbers();
	}
}