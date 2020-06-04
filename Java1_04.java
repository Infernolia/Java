import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the number :");
			n = sc.nextInt();
			for(int i=1;i<=n;i++)
			{
					

				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				


			System.out.print("\n");
			}
			
			System.out.print("\n");

//-----------------------------------------------------------------------
			for(int i=n;i>=1;i--)
			{
					

				for(int j=i;j>=1;j--)
				{
					System.out.print(j);
				}
				


			System.out.print("\n");
			}
			System.out.print("\n");

//----------------------------------------------------------------------

			for(int i=n;i>=1;i--)
			{
					

				for(int j=i;j>=1;j--)
				{
					System.out.print(n-i+1);
				}
				


			System.out.print("\n");
			}

			System.out.print("\n");
//----------------------------------------------------------------
	

	int i=1;
	
		while(i<=n)
			{
					
				int j=i;
				while(j>=1)
				
				{
					System.out.print(j);
					j--;
				}
				


			System.out.print("\n");
			i++;
			}

			System.out.print("\n");

//----------------------------------------------------------------
	

 i=1;
	
		while(i<=n)
			{
					
				int j=i;
				while(j>=1)
				
				{
					System.out.print(i);
					j--;
				}
				


			System.out.print("\n");
			i++;
			}

			System.out.print("\n");


//-----------------------------------------------------------

	i=1;
		while(i<=n)
			{
					
				int j=0;
				while(j<i)
				
				{
					int a = 65+j;
					char ch = (char) a;
					System.out.print(ch);
					j++;
				}
				


			System.out.print("\n");
			i++;
			}

			System.out.print("\n");


//-----------------------------------------------------------

	i=0;
		while(i<n)
			{
					
				int j=n-1;
				while(j>=i)
				
				{
					int a = 65+i;
					char ch = (char) a;
					System.out.print(ch);
					j--;
				}
				


			System.out.print("\n");
			i++;
			}

			System.out.print("\n");



//-----------------------------------------------------------

	i=1;
		while(i<=n)
			{
					
				int j=i;
				while(j>0)
				
				{
					int a = 65+n-j;
					char ch = (char) a;
					System.out.print(ch);
					j--;
				}
				


			System.out.print("\n");
			i++;
			}

			System.out.print("\n");


//-----------------------------------------------------------

	i=n;
		while(i>=1)
			{
					
				int j=0;
				while(j<i)
				
				{
					
					System.out.print('*');
					j++;
				}
				


			System.out.print("\n");
			i--;
			}

			System.out.print("\n");




//-----------------------------------------------------------

	i=1;
		while(i<=n)
			{
					
				int j=0;
				while(j<(n-i))
				
				{
					
					System.out.print('*');
					j++;
				}
				
				j=1;
				while(j<=i)
				
				{
					
					System.out.print(j);
					j++;
				}

			System.out.print('\n');
			i++;
			}

			System.out.print("\n");




//-----------------------------------------------------------

	
i=1;
		while(i<=n)
			{
					
				int j=0;
				while(j<(n-i))
				
				{
					
					System.out.print('*');
					j++;
				}
				
				j=n-i+1;
				while(j<=n)
				
				{
					
					System.out.print(j);
					j++;
				}

			System.out.print('\n');
			i++;
			}

			System.out.print("\n");

//-----------------------------------------------------------

	
int counter=0;
		for(int is=0;is<4;is++)
		{
			for(int j=0;j<=is;j++)
			{
				
				System.out.print(counter);	
				counter++;
			}
			System.out.print("\n");
			if(counter>=9)
				{
					break;
				}

		
		}

			System.out.print("\n");















}
			
		
}