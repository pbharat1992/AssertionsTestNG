
//bharat kumar chari panuganti jhj fsf
 
package mytests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestCases {
	 
	@Test
	public void test1() {
		SoftAssert softAssert1=new SoftAssert(); 

		System.out.println("open browser");
		Assert.assertEquals(true, true);
		
		//hard assertion:--hard assertion means if the hard assertion is  got failed the remaining statements will not be executed
		//and immediately the testcase is terminated
		
		//soft assertion:-- soft assertion is if the soft assertion is got failed the remaining statements will be executed 
		//and the testcase will not be terminated,you can also provide the message also(home page title is missing)
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		Assert.assertEquals(true, false);//hard assertion
		
		System.out.println("validate home page");
		softAssert1.assertEquals(true, false,"home page title is missing");//soft assertion
	
		System.out.println("validate deals page");
		System.out.println("create a deal");
				
		System.out.println("validate contacts page");
		System.out.println("create a contact");
		 
		
		//softAssert.assertAll();//for softassertion we use this because if in login page we are not able to login then there no point 
		                       //for executing the contacts or deals page but in soft assertion it is executing for this purpose we are using the 
		                       //soft assertion
		//dont write the softAssert.assertAll() in afterclass or aftermethod or any test otherwise tearDown method will be failed
				
	}
@Test
public void test2() {
	SoftAssert softAssert2=new SoftAssert(); 

	System.out.println("logout");
	softAssert2.assertEquals(true, false);
	softAssert2.assertAll();
}
	@AfterMethod
	public void tearDown() {
		//softAssert.assertAll();
	}
	
}
