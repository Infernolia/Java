import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n,key;
			int num[];
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the  number of values :");
			n=sc.nextInt();
			num = new int[n];
			for(int i=0;i<n;i++)
				{
					System.out.println("\n\n Enter the value : ");
					num[i]=sc.nextInt();				
				}
			for(int i=0;i<n;i++)
				{
					for(int j=0;j<n-1;j++)
							{
								if(num[j]>num[j+1])
								{
									int temp = num[j];
									num[j]=num[j+1];
									num[j+1]=temp;
								}				
							}
									
				}
			System.out.println("\n\n Enter the value to be found");
			key=sc.nextInt();

			int m = binarysearch(num,0,((num.length)-1),key);
			if(m==-1)
			{
				System.out.println("\n\nNot found");
			}
			else
			{
				System.out.println("\n\nFound");
			}

		}
		
	static int binarysearch(int a[], int low, int high, int key)
	{
		if(high>=low)
		{
		int mid= low + (high-1)/2;
		
			if(key==a[mid])
				{
		
					return mid;
				}
			if(key<a[mid])
				{
					
					return binarysearch(a,low,mid-1,key);
				}
			
				
					return binarysearch(a,mid+1,high,key);
				
		
		}
		return -1;

	}
	

}

