import java.util.*;




class Demo
		{
			public static void main(String args[])
				{
				if(args.length!=4)
				{
					System.out.println("\n\n Invalid no of args");
				}
				else{
				
				String name = args[0];
				int age = Integer.parseInt(args[1]);

				int id = Integer.parseInt(args[2]);
				int slaary = Integer.parseInt(args[3]);
				

				System.out.println(name +"  "+ age + "  "+ id + "  "+ slaary);
				}
				

				}
				
		}