import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 
{
	public static void main(String[] args) 
	{
//       Pattern patternObj = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
//       String input = "9898989899";
//       Matcher matcher = patternObj.matcher(input);
//       System.out.println(matcher.find());
       
		
		//[] square bracket kula kudukrathu character class solvaga
		//[7-9] first number 7 to 9 irukanum. [0-9] second 0 to 9 kula irukanum. {9} 10 digit no irukanum.
//		Pattern patternObj = Pattern.compile("[7-9][0-9]{9}");
//		String mobile = "9898989899";
//		Matcher matcher = patternObj.matcher(mobile);
//		System.out.println(matcher.find());
		
		
		//character class[@#$%^&*] symbolum kudukalam
		//itha mobileno and password validation real usage in regex
//		Pattern patternObj = Pattern.compile("[@#$%^&*][A-Za-z][0-9]");
//		String password = "%V7";
//		Matcher matcher = patternObj.matcher(password);
//		System.out.println(matcher.find());
		
		
		// ^ <-- this symbol name capsilan
		// rt <-- llama vera yeluthu irutha print pannum
//		String password = "rtrtrtrtrt";
//		Pattern patternObj = Pattern.compile("[^rt]");
//		Matcher matcher = patternObj.matcher(password);
//		System.out.println(matcher.find());
       
		
		// ^ <-- this symbol name capsilan
		// rt <-- llama vera yeluthu irutha print pannum outputla truenu varum abcd yeduthukurum
//		String password = "rtrtrtrtrtabcd";
//		Pattern patternObj = Pattern.compile("[^rt]");
//		Matcher matcher = patternObj.matcher(password);
//		System.out.println(matcher.find());
		
		
		// ^ <-- this symbol name capsilan
		// rt <-- llama vera yeluthu irutha print pannum outputla truenu varum abcd yeduthukurum
		String username = "abcd";
		String password = "rtrtrtrtrtabcd";
		Pattern patternObj = Pattern.compile("[^username]");
		Matcher matcher = patternObj.matcher(password);
		System.out.println(matcher.find());
	}
}
