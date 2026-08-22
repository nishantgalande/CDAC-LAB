import java.util.*;

public class CountNumArr{
	
	static void count(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0;i<num;i++){
			System.out.print("Enter element "+ (i+1) + " :");
			arr[i] = sc.nextInt();
		}
		
		int positive = 0;
		int negative = 0;
		for(int i = 0;i<num;i++){
			if(arr[i] > 0){
				positive++;
			}else if(arr[i] < 0){
				negative++;
			}else{
				System.out.println("Found zero at index: " + i );
			}
		}
		
		System.out.println("Positive numbers are: "+ positive);
		System.out.println("Negative numbers are: "+ negative);
	}
	
	public static void main(String[] args){
		CountNumArr.count();
	}
}