class Myclass extends Thread

{
	int x;
	public Myclass(int a)
	{
		x=a;	
	}
	public void run()
	{
	int i;
	for(i=0;i<=10;i++)
		{
		System.out.println(x+" "+Thread.currentThread().getName());
				x++;
	}
	}





}


class Demo
{
public static void main(String args[]) throws InterruptedException
{
Myclass o = new Myclass(50);
Myclass p = new Myclass(150);
Thread t1 = new Thread(o,"tOne");
Thread t2 = new Thread(o,"tTwo");

t1.start();
t1.join();
t2.start();
t2.join();
}
}