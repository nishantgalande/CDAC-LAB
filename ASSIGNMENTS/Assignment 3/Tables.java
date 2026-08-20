import java.util.Scanner;

public class Tables{
	
	static void printTable(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for(int i = 1;i<=10;i++){
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

	public static void main(String[] args){
		Tables.printTable();
	}
}