import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements Runnable
{
	Thread t;
	String msg ="Hello World";
	boolean flag = true;
	MyFrame3()
	{
		
		
		setSize(800,600);
		setTitle("My First Frame");
		setLocationRelativeTo(null);
		setVisible(true);
		t = new Thread(this);
		
		
	}

		

	public void paint(Graphics g)
	{
		Font f = new Font("Calibri",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.RED);
		g.drawString(msg,40,90);
		
	}

	void startThread()
	{
	t.start();

	}

	public void run()
	{
	char ch;
	String str;

	while(flag)
	{
		try
		{
			Thread.sleep(400);			

		}
		catch(InterruptedException e)
		{


		}	
		ch = msg.charAt(msg.length()-1);
		str = msg.substring(0,msg.length()-1);
		str = ch + str;
		msg = str;
		repaint();


	}
	
	

	

	
	}
}



class WindowCloser extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		we.getWindow().dispose();

	}


}




 class Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyFrame3 obj = new MyFrame3();
		WindowCloser wc = new WindowCloser();
		obj.addWindowListener(wc);
		obj.startThread();
		Thread.sleep(8000);
		obj.flag= false;

	}





}