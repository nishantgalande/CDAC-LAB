import java.util.*;

public class PrintArrStringEle{
	
	static void printElements(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int num = sc.nextInt();
		String arr[] = new String[num];
		sc.nextLine();
		
		for(int i = 0;i<num;i++){
			System.out.print("Enter element "+ (i+1) + " :");
			arr[i] = sc.nextLine();
		}
		
		
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		System.out.println();
	}
	
	public static void main(String[] args){
		PrintArrStringEle.printElements();
	}
}