import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the n for finding nth prime :");
			n = sc.nextInt();
			
			int count=1;
			for(int i=2;i<100000;i++)
			{
				int flag=0;
				for(int j=2;j<i;j++)
				{

					if(i%j==0)
					{
						flag++;
					}
				}

				if(flag==0 && i!=1 && i!=2)
				{
					count++;
				}
				if(count==n)
				{
					System.out.println("The nth prime is " + i );
					break;
				}
			}
			
			
			
		}
}