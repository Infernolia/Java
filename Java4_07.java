import java.util.*;



class Demo
		{
			public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					String name = new String();
					System.out.println("\n\nEnter the string: ");
					name = sc.nextLine();
					int count = 0;
					String fin = " ";

				for(int i =name.length()-1; i>=0 ; i--)
					{
					fin += name.charAt(i);	
					}
				
					System.out.println(fin);
				
				

				}
				
		}