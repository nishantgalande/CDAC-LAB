import java.util.Scanner;

public class OddNumbers{
	
	static void nums(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int ans = 0;
		for(int i = 1;i<=num;i++){
			if(i%2==1){
				ans = ans+i;
			}	
		}
		System.out.println("Sum of odd number's is : "+ans);
	}
	public static void main(String[] args){
		OddNumbers.nums();
	}
}