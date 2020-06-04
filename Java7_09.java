import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame 
{
	Button btnclick,btnclick1,btnclick2,btnclick3;
	TextField txtnumber,txtnumber1;
	Label lblnumber,lblnumber1,lblnumber2,lblnumber3;
	Panel pnlfirst,pnlsecond;
	
	MyFrame3()
	{
		
		
		setLayout(null);
		setSize(800,600);
		setTitle("My First Frame");
		setLocationRelativeTo(null);
		setVisible(true);

		int x,y;
		x = this.getHeight();
		y = this.getWidth();



		pnlfirst = new Panel();
		pnlfirst.setLayout(null);
		pnlfirst.setBounds(0,0,y,x/2);
		pnlfirst.setBackground(Color.red);
		add(pnlfirst);

		
		ButtonHandler5 bh5 = new ButtonHandler5(this,0);

		lblnumber = new Label("Enter Number for odd or even");
		lblnumber.setBounds(30,40,200,30);
		lblnumber.setFont(new Font("Arial",Font.BOLD, 20));
		pnlfirst.add(lblnumber);

		lblnumber2 = new Label("  ");
		lblnumber2.setBounds(300,200,100,30);
		lblnumber2.setFont(new Font("Arial",Font.BOLD, 20));
		pnlfirst.add(lblnumber2);


		btnclick = new Button("Check");
		btnclick.setFont(new Font("Arial",Font.BOLD, 20));
		btnclick.setBounds(100,150,90,60);
		btnclick.addActionListener(bh5);
		btnclick.setBackground(Color.RED);
		btnclick.setForeground(Color.BLUE);
		pnlfirst.add(btnclick);	

		
		txtnumber = new TextField();
		txtnumber.setBounds(30,90,100,30);
		txtnumber.setFont(new Font("Arial",Font.BOLD, 20));
		pnlfirst.add(txtnumber);	

		pnlsecond = new Panel();
		pnlsecond.setLayout(null);
		pnlsecond.setBounds(0,x/2,y,x/2);
		pnlsecond.setBackground(Color.blue);
		add(pnlsecond);
		
		ButtonHandler5 bh4 = new ButtonHandler5(this,1);
		
			
		lblnumber1 = new Label("Enter Number for prime");
		lblnumber1.setBounds(200,40,400,30);
		lblnumber1.setFont(new Font("Arial",Font.BOLD, 20));
		pnlsecond.add(lblnumber1);

		
		lblnumber3 = new Label("  ");
		lblnumber3.setBounds(300,200,100,30);
		lblnumber3.setFont(new Font("Arial",Font.BOLD, 20));
		pnlsecond.add(lblnumber3);
		

		
		
		btnclick1 = new Button("Check");
		btnclick1.setFont(new Font("Arial",Font.BOLD, 20));
		btnclick1.setBounds(300,150,90,60);
		btnclick1.addActionListener(bh4);
		btnclick1.setBackground(Color.RED);
		btnclick1.setForeground(Color.BLUE);
		pnlsecond.add(btnclick1);	

	

		txtnumber1 = new TextField();
		txtnumber1.setBounds(200,90,100,30);
		txtnumber1.setFont(new Font("Arial",Font.BOLD, 20));
		pnlsecond.add(txtnumber1);	
		
	}

		

	
	
	

	
	
}






class ButtonHandler5 implements ActionListener
{

	MyFrame3 ref;
	int indicator;
	public ButtonHandler5(MyFrame3 temp,int typ)
	{
		
		ref = temp;
		indicator = typ;
	}
	public void actionPerformed(ActionEvent e)
	{
		int x;
				
		if(indicator==0)
		{
		x = Integer.parseInt(ref.txtnumber.getText());
		
		if(x%2==0)
		ref.lblnumber2.setText("Even number");
		else
		{
		ref.lblnumber2.setText("Odd number");
		}
		}

		if(indicator==1)
		{
		x = Integer.parseInt(ref.txtnumber1.getText());
			
		int flag =0;
		for(int i=2;i<x;i++)
		{
		if(x%i==0)
		{
			flag =1;
		}
		
		}

		if(flag==0)		
		ref.lblnumber3.setText("Prime number");
		else
		ref.lblnumber3.setText("Composite number");
		}
		
	}
	






}





 class Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyFrame3 obj = new MyFrame3();
		
		
		

	}

}