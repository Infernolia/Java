import java.util.*;



class Myclass extends Thread
{
public void run()
{

for(int i=0;i<=10;i++)
{

System.out.println(i+" "+Thread.currentThread());
/*try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{


}*/

}
}


}

 class Demo
{
public static void main(String args[])throws InterruptedException
{

Myclass obj = new Myclass();
Myclass var = new Myclass();
Thread t1= new Thread(obj);
Thread t2 = new Thread(var);


t1.start();
//t1.join();
t2.start();
//t2.join();
//t1.run();
System.out.println("\n Main executing");





}


}