import java.util.*;



class Demo
		{
			public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					String names[] = new String[12];
					System.out.println("\n\nEnter the 6 employees first name and last name: ");
					String c = new String();
					for(int i = 0; i<12 ; i++)
					{
						names[i] = new String();
						names[i]= sc.next();
					}


				System.out.println("\n\n Enter character:");
				c= sc.next();
				for(int i = 0; i<12 ; i=i+2)
					{
						if(names[i].indexOf(c)==0)
						{
						System.out.print(names[i] + "    ");
						System.out.println(names[i+1] + "    ");
						}
					}
				for(int i = 1; i<12 ; i=i+2)
					{
						if(names[i].indexOf(c)==0)
						{
						System.out.print(names[i-1] + "    ");
						System.out.println(names[i] + "    ");
						}
					}


				}
				
		}
