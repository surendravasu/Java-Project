class Patient
{
public static void main(String[] args)
{
	Doctor people = new Doctor();
	people.tablet();
	people.insurance();
	System.out.println(Doctor.name);
	System.out.println(Doctor.doorno);
	System.out.println(people.offer);
	//System.out.println(people.profit);wrong
	people.promote();

}
}