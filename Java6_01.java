import java.util.*;

 class Demo
{
public static void main(String args[])throws InterruptedException
{
Thread t= Thread.currentThread();
System.out.println(t);




System.out.println(t.getName());
System.out.println(t.getPriority());


t.setName("Aboli");
t.setPriority(6);

System.out.println(t.getName());
System.out.println(t.getPriority());


System.out.println("Hi");
Thread.sleep(10000);
System.out.println("Bye");


for(int i=0;i<=10;i++)
{
System.out.println("Hi");
Thread.sleep(1000);
}

}


}