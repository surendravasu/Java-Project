
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular
{
     public static void main(String[] args) 
     {
    	 //forword slach \\ vanthu forword slachku pinadi kudukra valueva yeduthukrathuku
    	 //split() method kula irukrathu regular expersion
    	 //ore string kula kudukum pothu single | or simple kudutha pothu || or thevaillai
    	 String input = "https://www.gmail.com/mail";
    	 String[] st = input.split("\\:|\\//|\\.|\\/");
    	 for(String s : st)
    	 {
    		 System.out.println(s);
    	 }
    	 
     }
}
