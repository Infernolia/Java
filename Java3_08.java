import java.util.*;

class Number

{
		int roll;
		float weight;
		public Number()
		{
			Scanner sc = new Scanner(System.in);
			roll = sc.nextInt();
			weight = sc.nextFloat();
		}
		


}


class Demo

{
public static void main(String args[])
{
Number a[] = new Number[5];
for(int i=0;i<5;i++)
{
a[i]= new Number();
}
sort(a);
display(a);

}

static void sort(Number num[])
			{
				
					for(int i=0;i<num.length;i++)
						{
							for(int j=0;j<num.length-1;j++)	
							{
								if(num[j].roll>num[j+1].roll)
								{
								Number temp  = num[j];
								num[j] = num[j+1];
								num[j+1] = temp;
								}
							}
						}
				

			}

static void display(Number num[])
			{
				
					for(int i=0;i<num.length;i++)
						{
						System.out.println( " roll "+ num[i].roll + " " + num[i].weight);
						}
				

			}

}