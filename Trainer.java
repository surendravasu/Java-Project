class Trainer
{
private int salary = 10000;
String dept = "Java",institute = "Payilagam";
int getSalary()  
    {  
        return this.salary;  
    }  
void training()
{
	System.out.println("training");
}
// Trainer trainerkumar = new Trainer("CSE","Payilagam");
public Trainer(String name,String name1)
{
	this.dept = name;
	this.institute = name1;
	System.out.println(this.dept);
	System.out.println(this.institute);
}
public Trainer()
{
	
}
}

	
