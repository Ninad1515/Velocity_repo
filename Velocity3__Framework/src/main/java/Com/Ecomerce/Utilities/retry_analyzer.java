package Com.Ecomerce.Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_analyzer implements IRetryAnalyzer {
        int count=0;
        int Retrylimit=2;
        public boolean retry(ITestResult result) {
        	if(count<Retrylimit) {
        		count++;
        		return true;
        	}
        	return false;
        }
	

}
