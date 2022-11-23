package nov12th_saturday;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPovider_Concept {
	
	//Marks a method as supplying data for a test method. 
	//The annotated method must return an Object[][] 
	//where each Object[] can be assigned the parameter list of the test method. 
	//The @Test method that wants to receive data from this DataProvider needs to use a dataProvider name equals to the name of this annotation.

	
	//Steps to Remember: -
	//1. it returns and 2-D Object Array
	//2. you have to specify the data in rows and cols of this 2-D array
	//3. There must be at least one test Case which will be represented as @Test - you have to parameterize using an annotation
    //which is known as dataProvider and equate it to the name of the method which holds the 2-D array
    //4. pass the input parameters in the @Test method which should be equal to number of cols of the 2-D array

	@Test(dataProvider = "getData")
	public void data(String url, String uname, String password) {
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		
		data[0][0] = "url1";
		data[0][1] = "uname1";
		data[0][2] = "password1";
		
		data[1][0] = "url2";
		data[1][1] = "uname2";
		data[1][2] = "password2";
		
		return data;
	}
}
