import java.util.*;

public class SortArray{

	static void sort(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Elements: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0;i<num;i++){
			System.out.print("Enter element "+ (i+1) + " :");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0;i<num;i++){
			System.out.print(arr[i]+ " " );
		}
	}
	
	public static void main(String[] args){
		SortArray.sort();
	}
}