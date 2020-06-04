import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n,m;
			int result=0,choice=0;
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("\n\n Enter the  number :");
				m = sc.nextInt();
				result +=m;
			}

			System.out.println("\n\n 	Result is  :" + result);
			
			
		}
}