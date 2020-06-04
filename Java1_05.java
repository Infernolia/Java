import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int m,n;
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the number range :");
			m = sc.nextInt();
			n = sc.nextInt();
			for(int i=m;i<=n;i++)
			{
				int flag=0;
				for(int j=2;j<i;j++)
				{

					if(i%j==0)
					{
						flag++;
					}
				}

			if(flag==0 && i!=1)
			System.out.println(i+ " ");
			
			}
			
		}
}