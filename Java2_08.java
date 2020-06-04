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
			for(int[] x:num)
				{
				 x= sort(x);
				
				}
			
		


			for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
					System.out.print(num[i][j]+" ");
				
					}
			System.out.println();
				}
					
				
			
			

		}
		

 static int[] sort(int[] a)
{
	for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
					if(a[j]>a[j+1])
					{
						int temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
			}

		}
return a;	


}

	

}