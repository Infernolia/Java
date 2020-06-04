import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n;
			int num[][];
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the  number of arrays :");
			n=sc.nextInt();
			num = new int[n][];
			for(int i=0;i<n;i++)
				{
					System.out.println("\n\n Enter the no of values : ");
					int x= sc.nextInt();
					num[i]= new int[x];		
				}

			for(int i=0;i<n;i++)
				{
					for(int j=0;j<num[i].length;j++)
					{
					System.out.println("\n\n Enter the element: ");
					num[i][j]=sc.nextInt();
					}	
				}
				
			System.out.println("\n\n Jagged array : ");
			for(int[] x: num)
				{
					for(int y:x)
					{
						System.out.print(y + " ");	
					}	
				System.out.println();		
				}
			

		}
		

	

}


