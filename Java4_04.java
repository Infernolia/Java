import java.util.*;



class Demo
		{
			public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					String names[] = new String[6];
					System.out.println("\n\nEnter the 6 cities: ");
				
					for(int i = 0; i<6 ; i++)
					{
						names[i] = new String();
						names[i]= sc.next();
					}



					for(int i = 0; i<6 ; i++)
					{
						for(int j = 0; j < 5;j++)
							{
								if(names[j].compareTo(names[j+1])>0)
									{
	
									String temp = names[j];
									names[j]=names[j+1];
									names[j+1]= temp;
									}
							}
					}
				for(int i = 1; i<6 ; i++)
					{
						
						System.out.println(names[i] + "    ");
						
					}


				}
				
		}