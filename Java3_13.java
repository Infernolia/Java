import java.util.*;

class a
{

public int x;
public a()
{
x=17;
}

public void finalize()
{
System.out.println("\n\n Object destroyed");
}
}

class Demo

{
public static void main(String args[])
{
 a arr[] = new a[10];
for(int i=0;i<10;i++)
{
arr[i] = new a();
}
arr[5]=null;
System.gc();
}
}