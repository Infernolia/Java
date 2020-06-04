import java.util.*;



class Demo
		{
			public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					String name = new String();
					String word1 = new String();
					String word2 = new String();
					System.out.println("\n\nEnter the string: ");
					name = sc.nextLine();
					System.out.println("\n\nEnter the replaced word: ");
					word1 = sc.next();
					System.out.println("\n\nEnter the replacing word: ");
					word2 = sc.next();
					String fin = "";
					
					int x = 0;
					int a=0;
						
					int count = 0;
					int cnt[] = new int[10];
					for(int i = 0 ; i < (name.length());i++)
					{
						
						if((i+word1.length()<name.length()-1)&& (name.substring(i,i+(word1.length())).equals(word1)))
						{
						count++;
						cnt[count]=i;
						System.out.println(" "+ cnt[count]);
				
						}
					
					

					}
	int flag=0;
					for(int i = 0 ; i < (name.length());i++)
					{

						flag=0;
						for(int j=0;j<=count;j++)
						{
							if(i==cnt[j])
							{
								fin+=word2;
								i+=(word1.length()-1);
								flag=1;
								break;

							}
						}
					if(flag==0)
					{
						
						fin+=name.charAt(i);
					}
					}



					/*for(int i = 0 ; i < (name.length());i++)
					{
						if((i+word1.length()<name.length()-1)&& (name.substring(i,i+(word1.length())).equals(word1)))
						{
						fin+=word2;
						i+=(word1.length()-1);
						}	
						else
						{
							fin+=name.charAt(i);
						}
					}*/

				System.out.println(fin);

				}
				
		}