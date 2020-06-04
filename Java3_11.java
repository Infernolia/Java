import java.util.*;

class Number

{
		public Number()
		{
		
			System.out.println("\n In constructor");
		}
		

		{
			System.out.println("\n In anonymous");
		}

		public int inch,feet;
		
		public void get()
		{
		Scanner sc = new Scanner(System.in);
			inch = sc.nextInt();
			feet = sc.nextInt();
		}
		public void put()
		{

		System.out.println("\n\n Inches "+ inch + " \n\n Feet "+ feet);
		}
		public void total_inch()
		{
			int x = inch + feet*12;
				System.out.println("\n\n Inches "+ x);
		}
		static
		{
			System.out.println("\n In static");
		}
		
		


}


class Demo

{
public static void main(String args[])
{
 Number b ;
b = new Number();
b.get();
b.put();
b.total_inch();
}
}