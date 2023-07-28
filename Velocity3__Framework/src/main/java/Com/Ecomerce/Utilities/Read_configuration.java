package Com.Ecomerce.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_configuration {
	Properties pro;
	
	public Read_configuration() {
		File src=new File("C:\\Users\\Ninad\\eclipse-workspace\\Velocity3__Framework\\Configuration\\Confiig.properties");
		
		pro=new Properties();
        try {
		FileInputStream Fis= new FileInputStream(src);
        try {
        	pro.load(Fis);
        }catch(IOException e) {
        	e.printStackTrace();
        }
		
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
        
        
	}
	public String GetappURL() {
		String URL=pro.getProperty("BaseURL");
		return URL;
	}
	public String Username() {
		String Username=pro.getProperty("Username");
		return Username;
	}
	public String Pass() {
		String Pass=pro.getProperty("Password");
		return Pass;
	}
	public String GetChromepath() {
		String Chromepath=pro.getProperty("Chromdriver");
		return Chromepath;
	}
	public String GetFirefoxpath() {
		String Firefoxpath=pro.getProperty("Firefox");
		return Firefoxpath;
	}
}
