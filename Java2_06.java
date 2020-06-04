import java.util.*;
class Demo
{
	public static void main(String args[])
		{
			int num[][];
			Scanner sc = new Scanner(System.in);
			
			num = new int[5][3];
			

			for(int i=0;i<5;i++)
				{
					for(int j=0;j<3;j++)
					{
					System.out.println("\n\n Enter the element: ");
					num[i][j]=sc.nextInt();
					}	
				}

			for(int j=0;j<3;j++)
			{
					for(int m=0;m<5;m++)
					{
						for(int i=0;i<4;i++)
							{
								if(num[i][j]>num[i+1][j])
								{
									int temp = num[i][j];
									num[i][j]=num[i+1][j];
									num[i+1][j]=temp;
								}
					
						
							}
					}
			}
			for(int i=0;i<5;i++)
				{
					for(int j=0;j<3;j++)
					{
					System.out.print(num[i][j]+" ");
					}	
				System.out.println();
				}
				
			
			

		}
		

	

}