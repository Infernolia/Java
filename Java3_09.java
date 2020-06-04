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

display(a);

}



static void display(Number num[])
			{
				
					for(int i=0;i<num.length;i++)
						{
						System.out.println( " roll "+ num[i].roll + " " + num[i].weight);
						}
				

			}

}