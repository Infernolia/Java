import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame 
{
	Button btnclick,btnclick1,btnclick2,btnclick3;
	TextField txtnumber,txtnumber1;
	Label lblnumber,lblnumber1,lblnumber2;
	MyFrame3()
	{
		
		setLayout(null);
		setSize(800,600);
		setTitle("My First Frame");
		setLocationRelativeTo(null);
		setVisible(true);
		
		ButtonHandler5 bh5 = new ButtonHandler5(this,0);
		ButtonHandler5 bh4 = new ButtonHandler5(this,1);
		ButtonHandler5 bh3 = new ButtonHandler5(this,2);
		ButtonHandler5 bh2 = new ButtonHandler5(this,3);
		
		
		
		lblnumber = new Label("Enter Number 1:");
		lblnumber.setBounds(30,40,100,30);
		lblnumber.setFont(new Font("Arial",Font.BOLD, 20));
		add(lblnumber);

		lblnumber1 = new Label("Enter Number 2:");
		lblnumber1.setBounds(200,40,100,30);
		lblnumber1.setFont(new Font("Arial",Font.BOLD, 20));
		add(lblnumber1);

		lblnumber2 = new Label("  ");
		lblnumber2.setBounds(400,400,100,30);
		lblnumber2.setFont(new Font("Arial",Font.BOLD, 20));
		add(lblnumber2);
		

		btnclick = new Button("Add");
		btnclick.setFont(new Font("Arial",Font.BOLD, 20));
		btnclick.setBounds(100,300,90,60);
		btnclick.addActionListener(bh5);
		btnclick.setBackground(Color.RED);
		btnclick.setForeground(Color.BLUE);
		add(btnclick);	
		
		btnclick1 = new Button("Subtract");
		btnclick1.setFont(new Font("Arial",Font.BOLD, 20));
		btnclick1.setBounds(200,300,90,60);
		btnclick1.addActionListener(bh4);
		btnclick1.setBackground(Color.RED);
		btnclick1.setForeground(Color.BLUE);
		add(btnclick1);	

		btnclick2 = new Button("Multiply");
		btnclick2.setFont(new Font("Arial",Font.BOLD, 20));
		btnclick2.setBounds(300,300,90,60);
		btnclick2.addActionListener(bh3);
		btnclick2.setBackground(Color.RED);
		btnclick2.setForeground(Color.BLUE);
		add(btnclick2);	


		btnclick3 = new Button("Divide");
		btnclick3.setFont(new Font("Arial",Font.BOLD, 20));
		btnclick3.setBounds(400,300,90,60);
		btnclick3.addActionListener(bh2);
		btnclick3.setBackground(Color.RED);
		btnclick3.setForeground(Color.BLUE);
		add(btnclick3);	

		txtnumber = new TextField();
		txtnumber.setBounds(30,90,100,30);
		txtnumber.setFont(new Font("Arial",Font.BOLD, 20));
		add(txtnumber);	

		txtnumber1 = new TextField();
		txtnumber1.setBounds(200,90,100,30);
		txtnumber1.setFont(new Font("Arial",Font.BOLD, 20));
		add(txtnumber1);	
		
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

		int x,y;
		x = Integer.parseInt(ref.txtnumber.getText());
		y = Integer.parseInt(ref.txtnumber1.getText());
		if(indicator==0)
		{
		x = x+y;
		}
		else if(indicator==1)
		{
		x = x-y;
		}
		else if(indicator==2)
		{
		x = x*y;
		}
		else if(indicator==3)
		{
		x = x/y;
		}



		ref.lblnumber2.setText(String.valueOf(x));
	}
	






}





 class Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyFrame3 obj = new MyFrame3();
		
		
		

	}

}
