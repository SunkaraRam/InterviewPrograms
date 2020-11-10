package PageVlidations;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactory {

	@Factory
	public Object[] allDataprovider() {
		
		Object[] data = new Object[2];
		
		data[0] = new OrangeTest();
		data[1] = new PrimusTest();
		
		return data;
		
	}

}
