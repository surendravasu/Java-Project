package bank.chennai;
class Accountholder
{
	public static void main(String args[])
	{
		SBI account = new SBI(); // object created
		account.get_loan(300000);
		account.create_account();
		System.out.println(SBI.branch_name);
		
	}
}
		
		
		