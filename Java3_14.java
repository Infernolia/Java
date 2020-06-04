import java.util.*;




class Number
{

	private int arr[];

	public void getdata()
	{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();

		}
	}

		public int largest()
		{
			int max = arr[0];
			for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}

		}
		return max;

		}
	
	

}
class Demo
		{
			public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					
					Number a[] = new Number[3];

					for(int i=0;i<3;i++)
					{
					a[i]= new Number();
					a[i].getdata();	
					
					}
					int max = a[0].largest();
					for(int i=0;i<3;i++)
					{
					if(a[i].largest()>max)
					{
					max = a[i].largest();
					}
					
					}
				System.out.println(max);
					

		}

}