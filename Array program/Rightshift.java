
public class Rightshift 
{
	public static void main(String[] args) 
	{
		Rightshift ar = new Rightshift();
		ar.temp();
		ar.twice();
		ar.left();
		ar.leftShift();
	}

	//Rightshift Array Program
	public void temp()
	{
		int[] value = {10,5,8,3,2};
		System.out.println("Given Inputs : ");
		for(int j = 0; j < value.length; j++) 
		{
			System.out.print(value[j] + " ");
		}
		System.out.println();
		System.out.println("Right Shift Array Program");
		int temp = value[4];
		for(int i=4; i>=1; i--)
		{
			value[i] = value[i-1];
		}
		value[0] = temp;
		for(int i=0; i<value.length; i++)
		{
			System.out.print(value[i] + " ");
		}
		System.out.println();

	}

	//Right Shift Twice Program
	public void twice()
	{
		System.out.println("Right Shift Twice Program");
		int[] value = {10,5,8,3,2};
		int temp = value[4];
		int temp1 = value[3];
		for(int i=4; i>=2; i--)
		{
			value[i] = value[i-2]; 
		}
		value[1] = temp;
		value[0] = temp1;
		for(int i=0; i<value.length; i++)
		{
			System.out.print(value[i] + " ");
		}

	}

	//Left Shift Array Program
	public void left()
	{
		System.out.println();
		System.out.println("Left Shift Array Program");
		int[] value = {10,5,8,3,2};
		int temp = value[0];
		for(int i=0; i<=3; i++)
		{
			value[i] = value[i+1];
		}
		value[4] = temp;
		for(int i=0; i<value.length; i++)
		{
			System.out.print(value[i] + " ");
		}
	}

	//Left Shift Twice Program
	public void leftShift()
	{
		System.out.println();
		System.out.println("Left Shift Twice Program");
		int[] value = {10,5,8,3,2};
		int temp = value[0];
		int temp1 = value[1];
		for(int i=0; i<=2; i++)
		{
			value[i] = value[i+2];
		}
		value[3] = temp;
		value[4] = temp1;
		for(int i=0; i<value.length; i++)
		{
			System.out.print(value[i] + " ");
		}

	}
}



