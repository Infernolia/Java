import java.util.*;
class Demo
{
	public static void main(String args[])
		{
			int m,n;
			int num[][];
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the no of rows and cols: ");
			m = sc.nextInt();
			n = sc.nextInt();
			int addr[] = new int[m];
			int addc[] = new int[n];
			
			num = new int[m][n];
			

			for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
					System.out.println("\n\n Enter the element: ");
					num[i][j]=sc.nextInt();
					}	
				}
		

			
			for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
					 addr[i]+=num[i][j];
					}	
				
				}

			for(int i=0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
					 addc[i]+=num[j][i];
					}	
				
				}
		System.out.println("Row add");
		
				
				for(int i=0;i<m;i++)
				{
					System.out.println(addr[i] + " ");
				
				}
			
System.out.println("Col add");
		
				
				for(int i=0;i<n;i++)
				{
					System.out.println(addc[i] + " ");
				
				}
			
			
			

		}
		

	

}