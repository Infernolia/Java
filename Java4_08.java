import java.util.*;



class Demo
		{
			public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					String name = new String();
					System.out.println("\n\nEnter the string: ");
					name = sc.nextLine();
					String fin =" ";
				int i,j=0;

				for(i = 0; i<name.length(); i++)
					{
						if(name.charAt(i)!=' ')
						{
							break;
						}
						
							
					}
				
					for(j = name.length()-1;j>=0;j--)
					{
						if(name.charAt(j)!=' ')
						{
							break;
						}
					}
					for(int x = i;x<=j;x++)
					{
					fin+=name.charAt(x);
					}
					System.out.print(fin);
					System.out.println("D");
				
				

				}
				
		}