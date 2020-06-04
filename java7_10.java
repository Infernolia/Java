import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame 
{
	Button btnclick;
	TextField txtnumber,txtnumber1;
	Label lblnumber,lblnumber1,lblnumber2;
	MyFrame3()
	{
		
		setLayout(null);
		setSize(800,600);
		setTitle("My First Frame");
		setLocationRelativeTo(null);
		setVisible(true);
		
		ButtonHandler5 bh5 = new ButtonHandler5(this);
	
		
		
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
	
	public ButtonHandler5(MyFrame3 temp)
	{
		
		ref = temp;
		
	}
	public void actionPerformed(ActionEvent e)
	{

		int x,y;
		x = Integer.parseInt(ref.txtnumber.getText());
		y = Integer.parseInt(ref.txtnumber1.getText());
		
		x = x+y;
		


		ref.lblnumber2.setText(String.valueOf(x));
	}
	






}


class Demo

{
public static void main(String args[])
{
MyFrame3 obj = new MyFrame3();

}


}