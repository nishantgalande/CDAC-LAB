import java.util.Scanner;

public class SumofNum{
	
	static void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++){
			sum = sum + i;
		}
		System.out.println("Sum of nums is " + sum);
	}

	public static void main(String[] args){
		SumofNum.sum();
	}
}