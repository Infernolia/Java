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
					for(int i=0 ; i<name.length();i++)
					{
						if(name.charAt(i)==' ')
						{
						count++;
						}
					}
					String words[]  = new String[count];
					

					
						
						words= name.split(" ");
						String fin = " ";

				for(int i = count; i>=0 ; i--)
					{
						fin+=words[i];
						fin+=" ";
					}
				
					System.out.println(fin);
				
				

				}
				
		}