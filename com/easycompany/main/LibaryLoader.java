package com.easycompany.main;

public class LibaryLoader 
{
	public static void loadNativeLibarys throws Excpetion
	{
		if(System.getProperty("os.name").equals("Mac OS X"))
		{
			addLibaryPath("natives/macosx");
		}
		else if(System.getProperty(os.name).equals("Linux"))
		{
			addLibaryPath("natives/linux");
		}
		else 
		{
			addLibaryPath("natives/windows");
			if(System.getProperty(os.arch).equals("amd64") || System.getProperty("os.arch").equals("x86_64"))
			{
				System.loadLibrary("OPENAL64");
			}
			else
			{
				System.loadLibary("OPENAL32");
			}
		}
	}
public static void addLibaryPath(String path) throws Exception
{
	
}

}
