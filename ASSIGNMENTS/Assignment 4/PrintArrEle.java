import java.util.*;

public class PrintArrEle{
	
	static void printElements(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0;i<num;i++){
			System.out.print("Enter element "+ (i+1) + " :");
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+ " " );
		}

		System.out.println();
	}
	
	public static void main(String[] args){
		PrintArrEle.printElements();
	}
}