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
			
			System.out.println("\n\n Enter the  gender :");
				s = sc.next();
				gen = s.charAt(0);
			
			switch(gen)
			{
				case 'M':  System.out.println(" Male");break;
				case 'F':  System.out.println(" Female");break;
				
				case 'm':  System.out.println(" Male");break;
				case 'f':  System.out.println(" Female");break;
				default:break;

			}
			
			
			
		}
}