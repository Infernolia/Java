class ThirdParty
{
public void printString()
{
for(int i=0;i<=5;i++)
{
System.out.println("" +i +Thread.currentThread().getName());
}

}


}



class Mythr extends Thread
{
Thread t;
ThirdParty ref;
Mythr(ThirdParty obj)
{
t = new Thread(this);
ref = obj;
t.start();


}

public void run()
{
synchronized(ref)
{
ref.printString();
}   
}
}

class Demo
{
public static void main(String args[])
{

ThirdParty s = new ThirdParty();
Mythr t1 = new Mythr(s);
Mythr t2 = new Mythr(s);




}




}









//in above example, we got predictable output when we made printStrign method syschronised,
//if suppose printStirng is not synchronised and we have no access to thirs party clas
.// inthat case to get the synchronised outout, we have to synchronise that common object
//(obj) using which both threads r  calling printString() method.




















