package Com.Ecomerce.Utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;


public class Mytransformer implements IAnnotationTransformer{
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(retry_analyzer.class);
	}
	
	
	

}
