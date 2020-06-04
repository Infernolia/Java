class Mythr extends Thread
{
Thread t;
int x;

Mythr()
{
t = new Thread(this);
t.start();
}

public void run()
{
for(int i=0;i<10;i++)
{

System.out.println( x + " "+ Thread.currentThread().getName());
}


}



}


class Myclass
{

public static void main(String args[])
{
Mythr obj = new Mythr();


}


}