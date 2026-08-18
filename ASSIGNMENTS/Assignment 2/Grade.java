import java.util.Scanner;

public class Grade {
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of maths: ");
		int maths = sc.nextInt();
		System.out.print("Enter the marks of science: ");
		int science = sc.nextInt();
		System.out.print("Enter the marks of history: ");
		int history = sc.nextInt();
		
		int avg = (maths+science+history)/3;
		System.out.println("Avg is: "+ avg);
		

		if(avg >= 90)
			System.out.println("Grade A");
		else if(avg>70 && avg <= 89)
			System.out.println("Grade B");
		else if(avg>50 && avg <= 69)
			System.out.println("Grade C");
		else if(avg>30 && avg <= 49)
			System.out.println("Grade D");
		else
			System.out.println("Fail");
		
	}
}