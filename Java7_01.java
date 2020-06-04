import java.awt.*;


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
		g.drawLine(60,100,150,100);
		g.drawOval(150,150,100,100);
		g.fillOval(150,150,100,100);
		
	}

}
 class Demo
{
	public static void main(String[] args)
	{
		MyFrame2 obj = new MyFrame2();
		System.out.println("Total threads = "+ Thread.activeCount());

	}





}