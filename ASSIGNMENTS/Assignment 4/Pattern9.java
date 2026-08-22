import java.util.Scanner;

public class Pattern9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = 5;
		
		
		for(int i = 1;i<=num;i++){
			
			for (int k = num-i;k>=1;k--){
				System.out.print(" ");
			}
		
			for(int j = 1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 4;i>=1;i--){
			for (int k = 1;k<=num-i;k++){
				System.out.print(" ");
			}
			
			for(int j = 1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

