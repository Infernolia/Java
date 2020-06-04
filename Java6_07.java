class Myclass extends Thread

{
	int x;
	public Myclass(int a)
	{
		x=a;	
	}
	public void run()
	{
		System.out.println(x+" "+Thread.currentThread().getName());
	}





}


class Demo
{
public static void main(String args[]) throws InterruptedException
{
Myclass o = new Myclass(50);
Myclass p = new Myclass(150);
Thread t1 = new Thread(o);
Thread t2 = new Thread(p);

t1.start();
t1.join();
t2.start();
t2.join();





}





}