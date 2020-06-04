import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame
{
	MyFrame2()
	{
		
		// u can also call methods using this.
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setSize(800,600);
		setTitle("My First Frame");
		setLocationRelativeTo(null);
		setVisible(true);
		//setUndecorated(true);
	}

	public void paint(Graphics g)
	{
		Font f = new Font("Calibri",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.GREEN);
		g.drawString("Hello World",50,80);
		
		
	}

}



class MouseHandler implements MouseListener
{
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("Mouse Clicked");		


	}

	public void mousePressed(MouseEvent e)
	{
		System.out.println("Mouse Pressed");		


	}

public void mouseReleased(MouseEvent e)
	{
		System.out.println("Mouse Released");		


	}


public void mouseEntered(MouseEvent e)
	{
		System.out.println("Mouse Entered");		


	}

public void mouseExited(MouseEvent e)
	{
		System.out.println("Mouse Exited");		


	}




}






 class Demo
{
	public static void main(String[] args)
	{
		MyFrame2 obj = new MyFrame2();
		MouseHandler mh = new MouseHandler();
		obj.addMouseListener(mh);

	}





}