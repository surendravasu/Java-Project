package bank.madurai;
import bank.chennai.SBI;
class Ahmadhurai
{
public static void main(String[] args)
{
	SBI account = new SBI();
	account.get_loan(500000);
	account.create_account();
	System.out.println(SBI.branch_name);
}
}

