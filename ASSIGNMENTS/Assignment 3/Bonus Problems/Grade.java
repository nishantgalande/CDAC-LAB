import java.util.Scanner;

public class Grade {
	
	static void gradeCheck(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of maths: ");
		int maths = sc.nextInt();
		System.out.print("Enter the marks of science: ");
		int science = sc.nextInt();
		System.out.print("Enter the marks of history: ");
		int history = sc.nextInt();
		
		int avg = (maths+science+history)/3;
		System.out.println("Avg is: "+ avg);
		int grade;
		if (avg >= 90)
            grade = 1;
        else if (avg >= 70)
            grade = 2;
        else if (avg >= 50)
            grade = 3;
        else if (avg >= 30)
            grade = 4;
        else
            grade = 5;

        switch (grade) {
            case 1:
                System.out.println("Grade A");
                break;

            case 2:
                System.out.println("Grade B");
                break;

            case 3:
                System.out.println("Grade C");
                break;

            case 4:
                System.out.println("Grade D");
                break;

            case 5:
                System.out.println("Fail");
                break;
        }
		
	}
	
	
	public static void main(String[] args){
		Grade.gradeCheck();
	}
}