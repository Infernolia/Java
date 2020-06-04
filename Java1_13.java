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
			System.out.println("\n\n Enter the  gender :");
				s = sc.next();
				gen = s.charAt(0);
			
			switch(gen)
			{
				case 'M': if(age>=21) System.out.println(" Can marry"); else System.out.println(" Cannot marry");break;
				case 'F': if(age>=18) System.out.println(" Can marry"); else System.out.println(" Cannot marry");break;
				default:break;

			}
			
			
			
		}
}