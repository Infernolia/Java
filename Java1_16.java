import java.util.*;

class Demo
{
	public static void main(String args[])
		{
			int n,age;
			int result=0,choice=0;
			String s;
			char gen;
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n Enter the  age :");
				age = sc.nextInt();
			
			
			switch(age)
			{
				case 28: System.out.println("February");break;
				case 30: System.out.println("Nov");break;
case 31: System.out.println("Dec");break;
default: System.out.println("other month");break;
				

			}
			
			
			
		}
}
	