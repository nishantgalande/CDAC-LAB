import java.util.Scanner;

public class NumbersByThree{
	
	static void divByThree(int num){
		
		for(int i = 1;i<=num;i++){
			if(i%3==0)
				System.out.println(i);
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		NumbersByThree.divByThree(num);
	}
}