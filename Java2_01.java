import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n;
			int arr[];
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the  number of values :");
			n=sc.nextInt();
			arr = new int[n];
			for(int i=0;i<n;i++)
				{
					System.out.println("\n\n Enter the value : ");
					arr[i]=sc.nextInt();				
				}
				int key,i,j;
			for(i=0;i<n;i++)
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
		for(int ij=0;ij<n;ij++)
				{
					
					System.out.println(arr[ij]);			
				}
			

		}
		

	

}


