import java.awt.*;
import java.awt.GraphicsEnvironment;


 class MyFonts
{
	public static void main(String[] args)
	{
		
		String font[];
		GraphicsEnvironment ge;
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		font = ge.getAvailableFontFamilyNames();
		for(String s:font)
		{
			System.out.println(""+s);


		}
		System.out.println(""+ font.length);

	}





}