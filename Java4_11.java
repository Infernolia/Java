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
					String words[] = name.split(" ");
					for(int i = 0; i<words.length;i++)
					{
					fin+=words[i];
					}
					System.out.print(fin);
					System.out.println("D");
				
				

				}
				
		}