import java.util.*;



class Myclass extends Thread
{
int  time;

public Myclass(int x)
{

	time =x;
}
public void run()
{

for(int i=0;i<=10;i++)
{

System.out.println(i+" "+Thread.currentThread());
try
{
Thread.sleep(time);
}
catch(InterruptedException e)
{


}

}
}


}

 class Demo
{
public static void main(String args[])throws InterruptedException
{

Myclass obj = new Myclass(50);
Myclass var = new Myclass(150);
Thread t1= new Thread(obj);
Thread t2 = new Thread(var);


t1.start();
t1.join();
t2.start();
t2.join();
//t1.run();
System.out.println("\n Main executing");





}


}


//In above example, when we say t1.start(), thread t1 immediately goes to run method for execution. That doesnt mean, that run method is working for thread t1. run is  member fun of class Myclass
//hence, it will always work for the object ofo Myclass, so when we say t1.start(), thread t1 starts execution of run and run is working for the object of Myclass on which, thread t1 is set to work 
//