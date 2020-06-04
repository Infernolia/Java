
	import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n;
			int arr[];
			Scanner sc = new Scanner(System.in);
			
			arr = new int[20];
			
			for(int i=0;i<10;i++)
				{
					System.out.println("\n\n Enter the value : ");
					arr[i]=sc.nextInt();				
				}
				int key,i,j;
			for(i=0;i<10;i++)
				{
					
					key = arr[i];
					j=i-1;
					while(j>=0 && arr[j]>=key)
					{
						arr[j+1]=arr[j];
						j=j-1;
					}
					arr[j+1]=key;
									
				}


			System.out.println("\n\n Sorted array : ");
		for(int ij=0;ij<20;ij++)
				{
					
					System.out.println(arr[ij]);			
				}

		int x=10;
		arr[x]=arr[0];
		x++;
		for(int u=1;u<10;u++)
		{
			while(arr[u]==arr[u-1])
			{
			u++;
			}
			if(arr[u]!=arr[0])
		{
			arr[x]=arr[u];
			x++;
		}
		}
		
	System.out.println("\n\n  Finalarray : ");
		for(int ij=10;ij<20;ij++)
				{
					
					System.out.println(arr[ij]);			
				}
			
			

		}
		

	

}
