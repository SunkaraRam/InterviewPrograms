package TestiNGExamples;

import org.testng.annotations.Test;

public class TestDatabase {


	    @Test(testName = "test ConnectDB")
	    public void testConnectDB() {
	        System.out.println("Test Connect Database");
	    }

	    @Test(testName = "testConnectOracle", dependsOnMethods = "testConnectDB")
	    public void testConnectOracle() {
	        System.out.println("Test Connect Oracle()");
	    }

	    @Test(testName = "testConnectMsSQL", dependsOnMethods = "testConnectMongoDB")
	    public void testConnectMsSQL() {
	        System.out.println("Test Connect MsSQL");
	    }

	    @Test(testName = "testConnectMongo")
	    public void testConnectMongoDB() {
	        System.out.println("Test Connect MongoDB");
	    }

	
	
	
	
	
}
