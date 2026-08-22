import java.util.*;

public class LargestNumArr{
	
	static void largest(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0;i<num;i++){
			System.out.print("Enter element "+ (i+1) + " :");
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<num;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}

		System.out.println("Max number is: "+ max);
	}
	
	public static void main(String[] args){
		LargestNumArr.largest();
	}
}