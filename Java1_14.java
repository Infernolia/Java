import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n,age,age1;
			int result=0,choice=0;
			String s;
			char gen;
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the  age :");
				age = sc.nextInt();
			System.out.println("\n\n Enter the  age1 :");
				age1 = sc.nextInt();
			System.out.println("\n\n Enter the  chocie :");
				choice = sc.nextInt();
			switch(choice)
			{
				case 0: System.out.println(age+age1);break;
				case 1: System.out.println(age-age1);break;
				case 2: System.out.println(age*age1);break;
				case 3: System.out.println(age/age1);break;
		
			}
			
			
			
		}
}