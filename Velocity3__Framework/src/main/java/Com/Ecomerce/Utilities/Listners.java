package Com.Ecomerce.Utilities;

import java.io.IOException; 

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;


public class Listners extends Ecoomerce_baseclass implements ITestListener {

	ExtentTest test;	
	ExtentReports extent = ExtentReports1.GetReport();
	
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		//Extent Report  //10
		test=extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		//Extent Report   //pass
		extentTest.get().log(Status.PASS, "Test Passed");
	}	
	public void onTestFailure(ITestResult result) {
		
		extentTest.get().fail(result.getThrowable());
		
		String testmethodname=result.getMethod().getMethodName();
		
		try {
			driver= (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();	
		}
		try {
			extentTest.get().addScreenCaptureFromPath(Generic_Utils_SS.GetScreenshot(testmethodname, driver), result.getMethod().getMethodName());
		}catch (IOException e) {
			   e.printStackTrace();
		}
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}


}
