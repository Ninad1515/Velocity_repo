package Com.Ecomerce.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports1 {
	
	static ExtentReports extents;
	
	public static ExtentReports GetReport() {
		String Timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		String Name="ExtentReport---"+Timestamp;
		
		String Path = System.getProperty("user.dir")+"/Reports/"+Name+" "+".html";
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(Path);
		reporter.config().setReportName("Velocity3_Framework Extent Report");
		reporter.config().setDocumentTitle("Velocity3_Framework Execution Result");
		
		extents=new ExtentReports();
		extents.attachReporter(reporter);
		
		extents.setSystemInfo("QA Automation Enginner", "Ninad Patil");
		extents.setSystemInfo("Suite Name", "Regression/smoke");
		
		return extents;
	}

}
