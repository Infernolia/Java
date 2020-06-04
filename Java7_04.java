import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{

	String msg;
	int x,y;
	MyFrame()
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
		g.setColor(Color.RED);
		g.drawString(msg,x,y);
		
	}

}





class MouseHandler implements MouseMotionListener
{

	MyFrame ref;
	MouseHandler(MyFrame temp)
	{
	ref =temp;

	}
	public void mouseMoved(MouseEvent me)
	{
		ref.x = me.getX();
		ref.y = me.getY();
		ref.msg="Mouse moved";
		ref.repaint();

	}

	public void mouseDragged(MouseEvent me)
	{
		ref.x = me.getX();
		ref.y = me.getY();
		ref.msg="Mouse dragged";
		ref.repaint();

	}




}


 class Demo
{
	public static void main(String[] args)
	{
		MyFrame obj = new MyFrame();
		MouseHandler mh = new MouseHandler(obj);
		obj.addMouseMotionListener(mh);

	}





}