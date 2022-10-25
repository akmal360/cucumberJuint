//package hooksFile;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.Scenario;
//
//
//public class AmazonHooks {
//
//	@Before
//	public void setup(Scenario sc) {
//		System.out.println("Launch Amazon application");
//		System.out.println("***"+sc.getName());
//	}
//	
//	
//	@After
//	public void tearDown() {
//		System.out.println("Close the browser ");
//	}
//	
//	@BeforeStep
//	public void takeScreenshot() {
//		System.out.println("take screen shot");
//	}
//	
//	@AfterStep
//	public void refreshPage() {
//		System.out.println("refreash the page");
//	}
//}
