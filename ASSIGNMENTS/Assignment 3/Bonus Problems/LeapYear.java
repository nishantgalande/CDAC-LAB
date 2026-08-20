import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		int result;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            result = 1;
        } else {
            result = 0;
        }
		switch(result){
			case 1:
				System.out.println(year + " is leap year!");
				break;
			default:
				System.out.println(year + " is not leap year!");
				break;
		}
	}
}