package com.easycompany.main;
import org.newdawn.slick.*;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import static org.lwjgl.opengl.GL11.*;

public class EComp 
{
	
	public static void main(String[] args)
	{
		try
		{
			LibaryLoader.loadNativeLibarys();
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();System.out.println("Sorry :(");
			System.exit(0);
		}
	}
	

}
