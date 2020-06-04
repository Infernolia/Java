class Mythr extends Thread
{
Thread t;
int x;
Mythr(String name,Mythr ref)
{
t = new Thread(ref,name);


}
Mythr()
{

x=10;
}
void startThread()
{
t.start();


}

 public void run()
{
show();
}


synchronized public void show()
{
for(int i=0;i<=10;i++)
{
x++;
System.out.println(x+ " "+ Thread.currentThread().getName());
}


}

}


class Myclass
{


public static void main(String args[])
{

Mythr obj = new Mythr();
Mythr t1 = new Mythr("T1",obj);
Mythr t2 = new Mythr("T2",obj);
t1.startThread();
t2.startThread();

}






}