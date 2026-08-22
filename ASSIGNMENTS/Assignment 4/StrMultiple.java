

public class StrMultiple{
	
	
	static void multipleStr(){
		String str1 = "Galande";
		String str2 = "Galande";
		String str3 = "Galande";
		
		if((str1 == str2) && (str2 == str3)){
			System.out.println("All string point the same object: True");
		}else{
			System.out.println("All string point the same object: False");
		}
		
	}
	
	public static void main(String[] args){
		StrMultiple.multipleStr();
	}
}