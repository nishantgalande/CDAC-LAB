import java.util.*;

public class CheckNumInArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0;i<num;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter number you want to search: ");
		int search = sc.nextInt();
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == search){
				System.out.println("Number found");
				return;
			}
		}

		System.out.println("Number not found");
	}
}