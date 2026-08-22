import java.util.*;

public class SumOfArrEle{
	
	static void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0;i<num;i++){
			System.out.print("Enter element "+ (i+1) + " :");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0;i<num;i++){
			sum+=arr[i];
		}

		System.out.println("Sum is: "+ sum);
	}
	
	public static void main(String[] args){
		SumOfArrEle.sum();
	}
}