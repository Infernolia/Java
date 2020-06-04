class ThirdParty
{
	public void printString(String msg)
	{

		System.out.print("[");
		try{Thread.sleep(100);}catch(InterruptedException e){}
		
		System.out.print(msg);
		System.out.println("]");			
	}






}


class Mythr extends Thread
{

Thread t;
ThirdParty h;
String f;

Mythr(ThirdParty A,String y)
{
t = new Thread(this);
f = y;
h =A;
 t.start();

}


public void run()
{
synchronized(h)
{

h.printString(f);

}

}










}




class Demo
{
	public static void main(String args[])
	{
		ThirdParty obj = new ThirdParty();
		Mythr t1= new Mythr(obj,"Aboli");
		Mythr t2= new Mythr(obj,"Marathe");


	}

}