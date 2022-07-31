class School
{
int mark;
private int salary = 50000;
static String school_name = "Thambithottam higher sec school";
public static void main(String[] args)
{
  School teacher = new School();
  System.out.println(teacher.salary);
}
void conduct_exams()
{
System.out.println("annual");
}
void publish_results(int mark)
{
System.out.println(mark);
}
	
}
