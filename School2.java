class School2
{
int student,teacher;
String school_name;
	School2(int student,int teacher)
	{
		this.student = student;
		this.teacher = teacher;
		System.out.println("constructor");
	}
		
public static void main(String args[])
{
School2 madam = new School2(40,1);
School2 sch = new School2(100, 5);
System.out.println("no of student  " +madam.student);
System.out.println("no of teacher   "+sch.teacher);
}
}
