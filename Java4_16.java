import java.util.*;



class Demo
		{
			public static void main(String args[])
				{
					String str[] = {"hello","world","java"};
					for(String s:str)
					{
						System.out.println(" "+s);
					}
					String arr[] = new String[5];
					Scanner sc = new Scanner(System.in);
					for(int i=0;i<arr.length;i++)
					{
						arr[i]= sc.nextLine();

					}
					for(String s:arr)
					{			
						System.out.println(" "+s);
					}
 
				}
				
		}