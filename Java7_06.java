import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements Runnable
{
	Thread t;
	int x,y;
	int factor =2;
	boolean flag = true;
	MyFrame3()
	{
		
		x = 30;
		y = 50;
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
		g.fillOval(x,y,80,80);
		
	}

	void startThread()
	{
	t.start();

	}

	public void run()
	{
	

	while(flag)
	{

		x=x+factor;
		if(x==0)
		{
		factor = 2;
		}
		if(x==this.getWidth()-40)
		{
		factor = -2;
		}	
		
		repaint();
		try
		{
			Thread.sleep(50);			

		}
		catch(InterruptedException e)
		{


		}

	}
	
	

	

	
	}
}

class WindowCloser extends WindowAdapter
{
	MyFrame3 ref;
	WindowCloser(MyFrame3 temp)
	{

		ref = temp;
	}
	public void windowClosing(WindowEvent we)
	{
		ref.flag= false;
		ref.dispose();

	}


}

class MouseHandler implements MouseListener
{
	MyFrame3 ref;
	MouseHandler(MyFrame3 temp)
	{

		ref = temp;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		if(ref.flag==true)
		{
			ref.flag=false;
		}
		else
		{
		ref.flag = true;
		ref.t = new Thread(ref);
		ref.startThread();
		
		}
	}

	public void mousePressed(MouseEvent e)
	{
				


	}

public void mouseReleased(MouseEvent e)
	{
			


	}


public void mouseEntered(MouseEvent e)
	{
	

	}

public void mouseExited(MouseEvent e)
	{
				


	}




}
 class Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyFrame3 obj = new MyFrame3();
		WindowCloser wc = new WindowCloser(obj);
		obj.addWindowListener(wc);
		MouseHandler mh = new MouseHandler(obj);
		obj.addMouseListener(mh);
		obj.startThread();
		
		

	}





}