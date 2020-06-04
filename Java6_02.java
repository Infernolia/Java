import java.util.*;


class Hello extends Thread
{
public void run()
{

System.out.println("\nIn Hello run =");
System.out.println(Thread.currentThread());
}

}

class Number extends Thread
{

public void run()
{

System.out.println("\nIn Number run =");
System.out.println(Thread.currentThread());
}




}

 class Demo
{
public static void main(String args[])
{

Hello obj = new Hello();

Number ob = new Number();
Thread t= new Thread(ob);
t.start();
System.out.println("De"+Thread.currentThread().getName());
System.out.println("Di"+t.getName());
System.out.println("Main ends");

}


}