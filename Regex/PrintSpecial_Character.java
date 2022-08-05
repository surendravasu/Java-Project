import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintSpecial_Character 
{
     public static void main(String[] args) 
     {
//    	String input = "Vsvasu93@gmail.com";
//		//Pattern patternObj = Pattern.compile("[A-za-z0-9]");  //outputla special character vitutu Vsvasu93gmailcom print panum
//    	
//    	//outputla only printed number and special character ^ intha symbol kudutha mathala varathu 93@. print agum.
//		Pattern patternObj = Pattern.compile("[^A-Za-z]"); 
//    	Matcher matcher = patternObj.matcher(input);
//		while(matcher.find())
//		{
//			System.out.print(matcher.group());
//		}
		
		//small s kudutha space edthu print panum
//		String input = "abc abc abc abc abc";
//		Pattern patternObj = Pattern.compile("\\s"); 
//    	Matcher matcher = patternObj.matcher(input);
//		while(matcher.find())
//		{
//			System.out.print(matcher.group());
//			System.out.println("space");
//		}
		
		
//		String password = "abc abc abc abc abc";
//		System.out.println(password.length());
//		Pattern patternObj = Pattern.compile("\\S"); 
//    	Matcher matcher = patternObj.matcher(password);
//		while(matcher.find())
//		{
//			System.out.print(matcher.group());
//		}
		
//    	//[^abcd] kuduthalum outputla 123 print agum. "\\d" ipdi kuduthalum ouputla 123 tha print agum.
//		String password = "abcd123";
//	  //Pattern patternObj = Pattern.compile("[^abcd]"); 
//		Pattern patternObj = Pattern.compile("\\d");
//    	Matcher matcher = patternObj.matcher(password);
//		while(matcher.find())
//		{
//			System.out.print(matcher.group());
//		}
//		
		
    	 
    	// small w kudutha abcd123 print aguthu //capital W kudutha @#$% special character print aguthu
		String password = "Abcd123@#$%";
	  //Pattern patternObj = Pattern.compile("[^abcd]"); 
		Pattern patternObj = Pattern.compile("\\W");
    	Matcher matcher = patternObj.matcher(password);
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}
			
		
	 }
}
