
public class Binary_Search 
{
	static int no[] = {2,4,8,9,15,20,13};       //index = 0,1,2,3,4
	public static void main(String[] args) 
	{
		Binary_Search binary = new Binary_Search();
		binary.find_binarysearch(no);
	}

	private void find_binarysearch(int no[]) 
	{
		int key = 4;
		int s = 0;
		int e = no.length - 1 ;
		while(true)
		{
			int mid = (s + e) / 2;             //0+4 = 4  s = 0,  e = 4,   4/2=2      midvalue = 2
			if(key == no[mid])       //so 2 index value is 8 not key number so right side move the number 8 ku mela athigamana number
			{
				System.out.println(key + " is present at " +mid);
				break;
			}
			else if(key > no[mid])
			{
				s = mid + 1;       //2+1=3   s = 3, e = 4,  3+4=7,  7/2 = 3.5   midvalue = 3
			}
			else
			{
				e = mid - 1;
			}
		}
	}
}

