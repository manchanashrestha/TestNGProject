package TestNGPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PracticingTestNG {
	WebDriver driver;
	String userName;
	String passWord;
	String confirmPassword;
	String email;
	
	@Test
	public void ValidationOfUSerID()
	{
		driver.get("httos://www.google.com");
	}

	
	@Test
	public void NextButtonISActiveOrNot()
	{
		driver.get("https://www.gmail.com");
		System.out.println("Test method executed..");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("After test method executed...");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test method is executed...");
		driver.close();
	}
	

}
