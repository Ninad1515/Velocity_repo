package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Annotaion {
	
	
	//Execution sequence of annotaions
	//@beforesuite= setup systemproperty
	//@beforetest= enter URl
	//@BeforeClass= launch browser
	//@berforemethod= login application
	//@test1-google title
	//@Aftermethod=logout from application
	//@berforemethod= login application
	//@test2-google title
	//@Aftermethod=logout from application
	//@berforemethod= login application
	//@test3-google title
	//@Aftermethod=logout from application
    //afterclass=close browser
	//aftertest=Delete cookies
	
	//precondition annotaions
	//1.@beforeSuite=setup system pro
	
	//in real time project we dont need all these anotations .We use only
	//beforeclass @beforemethod @test @agetmethod @afterclass
	
	@BeforeSuite
	public void Setup() {
		System.out.println("BeforeSuite-->Setup System property");
	}
	@BeforeTest
	public void URL() {
		System.out.println("BeforeTest-->Enter URL");
	}
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("BeforeClass-->LaunchBrowser");
	}
	@BeforeMethod
	public void Login() {
		System.out.println("BeforeMethod-->Login Application");
	}
	@Test (priority = 3)
	public void GoggleTitle1() {
		System.out.println("@test-->Google Tiltle1");
	}
	@Test(priority = 1)
	public void GoggleTitle2() {
		System.out.println("@test-->Google Tiltle2");
	}
	
	//postcondition annotaions
	@AfterMethod
	public void Logout() {
		System.out.println("@Aftermethod-->Logout from app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("@Afterclass-->Close the browser");
	}
	@AfterTest
	public void DeleteCookies() {
		System.out.println("@AfterTest-->Delete the cookies");
	}
	@AfterSuite
	public void Logout1() {
		System.out.println("@Aftersuite-->Logout1");
	}
	@Test(priority = 2)
	public void GoggleTitle3() {
		System.out.println("@test-->Google Tiltle3");
	}
	
}
