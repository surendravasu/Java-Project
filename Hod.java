class Hod
{
public static void main(String[] args)
{
	int student  = 100;
Hod madam = new Hod();
int res1 = madam.add(student);  // argument passing
int res2 = madam.sub(student);		// method calling with arguments
System.out.println("res1 ::::   " +res1);
System.out.println("res2 ::::   " +res2);
}
// method definition
int add(int stu) // receive argument
{
System.out.println("addition " +stu);
return 8;
}
// method definition
int sub(int stud) // receive argument
{
System.out.println("Subtraction " +stud);
	return 1;
}
}			