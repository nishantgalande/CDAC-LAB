
public class StrLiterals{
	
	static void checkLiterals(){

		String str = "hello";

		String str1 = "hello";
			
		if(str1 == str){
			System.out.println("The string "+ str + " & " + str1 + "pointing to same address in memory!");
		}
		
	}
	
	public static void main(String[] args){
		StrLiterals.checkLiterals();
	}
}