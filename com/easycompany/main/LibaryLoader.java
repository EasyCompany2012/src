package com.easycompany.main;

import java.lang.reflect.Field;

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
				System.loadLibrary("OPENAL32");
			}
		}
	}
public static void addLibaryPath(String s) throws Exception
{
	final Field usr_paths_field = ClassLoader.class.getDeclaredField("usr_paths")
			usr_paths_field.setAccessible(true);
	final String[] paths = (String[]) usr_paths_field.get(null);
	for (String path : paths)
	{
		if (path.equals(s))
		{
			return;
		}
	}
		final String[] new_paths = ArrayS.copyOf(paths, paths.length +1);
		new_paths(paths.length -1)
}

}
