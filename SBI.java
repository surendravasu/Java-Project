package bank.chennai;
public class SBI
{
String empname; 
int empid;
public static String branch_name = "chennai";
public void get_loan(int amount)
{
	System.out.println("***** get_loan *****");
SBI check = new SBI();
check.empname = "murugan";
check.empid = 4532;
System.out.println(check.empname);
System.out.println(check.empid);
System.out.println(SBI.branch_name);
System.out.println(amount);
}
public void create_account()
{
	System.out.println("***** create_account *****");
SBI rupees = new SBI();
rupees.empname = "alagar";
rupees.empid = 1234;
System.out.println(rupees.empname);
System.out.println(rupees.empid);
System.out.println(SBI.branch_name);
}
}

