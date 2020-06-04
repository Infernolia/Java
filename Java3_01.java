import java.util.*;

class Employee
	{
		private int id;
		private float salary;
		private String name;
		public Employee()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("\n\n Enter the id :");
				id = sc.nextInt();
			System.out.println("\n\n Enter the salary :");
				salary = sc.nextFloat();
			System.out.println("\n\n Enter the name :");
				name = sc.next();

		}
		protected void finalise()
		{
			System.out.println("\n\n Object destoyed");
	
		}

			public void searchn(Employee num[], String nam)
			{
			int flag =0;
					for(int i=0;i<num.length;i++)
						{
							if(num[i].name.equals(nam))
							{
							flag = 1;
							System.out.println("\n\n FOUND");
							System.out.println("\n\n Name :" + num[i].name);
							System.out.println("\n\n  Id: " +num[i].id);
							System.out.println("\n\n Salary: " + num[i].salary);
							break;	
							}
						}
				if(flag==0)
				{
					System.out.println("\n\n Not found");
				}

			}

			public void searchi(Employee num[],int ide)
			{
			int flag =0;
					for(int i=0;i<num.length;i++)
						{
							if(num[i].id==ide)
							{
							flag = 1;
							System.out.println("\n\n FOUND");
							System.out.println("\n\n Name :" + num[i].name);
							System.out.println("\n\n  Id: " +num[i].id);
							System.out.println("\n\n Salary: " + num[i].salary);
							break;	
							}
						}
				if(flag==0)
				{
					System.out.println("\n\n Not found");
				}

			}
			
			public void sort(Employee num[])
			{
				
					for(int i=0;i<num.length;i++)
						{
							for(int j=0;j<num.length-1;j++)	
							{
								if(num[j].salary>num[j+1].salary)
								{
								Employee temp  = num[j];
								num[j] = num[j+1];
								num[j+1] = temp;
								}
							}
						}
				

			}
			public void searchd(Employee num[], String nam)
			{
				int flag =0;
				int j=0;
					for(int i=0;i<num.length;i++)
						{
							if(num[i].name.equals(nam))
							{
							flag=1;
							System.out.println("\n\nFound");
							
							if(i!=(num.length-1))
							{
							for(j=i;j<num.length-2;j++)
							{
								num[j]=num[j+1];
							}
							num[j]=null;
							}
							else
							{
							num[i]=null;
							}
							
							break;	

	
							}
						}
			System.gc();
				if(flag==0)
				{
					System.out.println("\n\n Not found");
				}
			}

			public void display(Employee num[])
			{
				for(int i=0;i<num.length;i++)
						{
							
							
							System.out.println("\n\n Name :" + num[i].name);
							System.out.println(" Id: " +num[i].id);
							System.out.println(" Salary: " + num[i].salary);
								
							
						}
			}
			public void display2(Employee num[])
			{
				for(int i=0;i<num.length;i++)
						{
							
							if(num[i]!=null)
						{
							System.out.println("\n\n Name :" + num[i].name);
							System.out.println(" Id: " +num[i].id);
							System.out.println(" Salary: " + num[i].salary);
						}
								
							
						}
			}
	}


class Demo
	{
		public static void main(String args[])
			{
				int n;
				Scanner sc= new Scanner(System.in);
				System.out.println("\n\n Enter the number of employees :");
				n = sc.nextInt();
				Employee e[] = new Employee[n];
				for(int i=0;i<e.length;i++)
						{
							e[i] = new Employee();
						}
				e[0].display(e);

				int choice,choice1=0;
				String nam;
				int ide;
				
				while(1==1)
				{
					System.out.println("\n\n What option? \n 1. Search by name\n 2. Search by id \n 3. Sort by salary \n 4. Search by name and delete if found :");
					choice1 = sc.nextInt();
					switch(choice1)
						{
							case 1:System.out.println("\n\n Enter the name to be searched:");
								nam = sc.next(); 
								e[0].searchn(e,nam);break;
							case 2:System.out.println("\n\n Enter the id to be searched:");
								ide = sc.nextInt(); 
								e[0].searchi(e,ide); break;
							case 3: e[0].sort(e);e[0].display(e);break;
							case 4: System.out.println("\n\n Enter the name to be searched and deleted:");
								nam = sc.next(); 
								e[0].searchd(e,nam);e[0].display2(e);break;
							default: break;
							

						}

					System.out.println("\n\n Do you want to continue :");
					choice = sc.nextInt();
					if(choice==0)
					{
						break;
					}
				}




			}

		


	}