import java.util.*;


class hello extends Thread
{
public void run() 
{
try
{
System.out.println("\n\nEntered");
Thread.sleep(1000);
System.out.println("\n\nExited");
}
catch(InterruptedException e)
{
System.out.println("Caught"+e);
}

}


}





class Demo

{
public static void main(String args[]) throws InterruptedException
{
	hello obj = new hello();
	System.out.println(""+Thread.currentThread().isAlive());
	Thread t = new Thread(obj);
	t.start();
	System.out.println(""+t.isAlive());
	t.join();
	System.out.println(""+t.isAlive());
	System.out.println("\n\n"+ Thread.currentThread().getName()+"ends");



}
}