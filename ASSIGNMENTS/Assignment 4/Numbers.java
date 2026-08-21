import java.util.Scanner;

public class Numbers{
	
	static void printNumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++){
			System.out.print(i + " " );
		}
	}
	public static void main(String[] args){
		Numbers.printNumbers();
	}
}