class Mythr extends Thread
{
Thread t;
int x;


void startThread()
{
t.start();

}
Mythr(int a)
{
t = new Thread(this);
t.startThread();
try
{
Thread.sleep(5000);
}
catch(Exception e)
{}

x = a;
}

synchronized public void run()
{
for(int i=0;i<10;i++)
{


System.out.println( x + " "+ Thread.currentThread().getName());
x++;
}


}



}


class Myclass
{

public static void main(String args[])
{
Mythr obj = new Mythr(40);
Mythr obj1 = new Mythr(40);


}


}