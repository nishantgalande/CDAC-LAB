
public class StrIntern{
	
	static void stringIntern(){
		String str1 = new String("Nishant");
		String str2 = str1.intern();
		String str3 = "Nishant";
			
		if(str2 == str3){
			System.out.println("The string "+ str1 + " & " + str2 + " pointing to same address in memory!");
		}else{
			System.out.println("The string "+ str1 + " & " + str2 + "are not pointing to same address in memory!");
		}
		
	}
	
	public static void main(String[] args){
		StrIntern.stringIntern();
	}
}