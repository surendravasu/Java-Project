
public class Calculator 
{
	  //int no = 5;         //<--global varaible stright ve method kula pass panikalam.
	
    public static void main (String args[])
    {
    	Calculator calc = new Calculator();
    	int result = calc.add();
    	System.out.println(result);
    	double result1 = calc.value();
    	System.out.println(result1);
    	System.out.println(calc.check());
    	int result2 = calc.subtract(result,10);
    	System.out.println(result2);
    	calc.multiple(result2);
    	
    }
    
    public int add()
    {
    	return 10+20;
    }
    
    public double value()
    {
    	return 20.5 + 40;
    }
    
    char check()
    {
    	return 'A';
    }
    int subtract(int no1, int no2)
    {
    	return no1 - no2;
    }
    public void multiple(double no1)
    {
    	int no = 5; //<-- non static method kula variable declare pani panalam and class area variable declare pani straight ve pass panlam
    	System.out.println(no1 * no);  //<--global variable stright ve pass paniklam
    }
}
