class Myclass extends Thread
{
int x,y;

Myclass(int a,int b)
{
x=a;
y=b;

}
 synchronized public void run()
{
System.out.println("[");
System.out.println("My message");
try
{
Thread.sleep(1000);

}
catch(InterruptedException e)
{

}
System.out.println("]");


}




}


class Demo
{
public static void main(String args[])
{
Myclass obj = new Myclass(1,50);
Myclass var = new Myclass(1,150);
Thread t1= new Thread(obj,"T1");
Thread t2= new Thread(obj,"T2");
Thread t3= new Thread(obj,"T3");
t1.start();
t2.start();
t3.start();
}



}