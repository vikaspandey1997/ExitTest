package stepdefinitons_exit;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class exitTest 
{
	static WebDriver driver;
@Given("User launches the application")
public void user_launches_the_app()
{
System.setProperty("webdriver.chromer.driver","C:\\Users\\training_d2.03.07\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}
@Then("User clicks on Login")
public void user_clicks_on_Signin()
{
	driver.findElement(By.xpath(".//a[@href='login.htm']")).click();	
}

@Then("enters username {string}")
public void enters_his_username(String string)
{
	driver.findElement(By.name("userName")).sendKeys(string);
}

@Then("enters password{string}")
public void enters_his_password(String string)
{
	driver.findElement(By.name("password")).sendKeys(string);
	
}
@Then("verifies the login")
public void verifies_the_Signin()
{
	driver.findElement(By.name("Login")).click();
	String s=driver.findElement(By.xpath(".//*[@test='true']")).getText();
	System.out.println(s);
	Assert.assertTrue(s.contains("Hi, Lalitha"));
	
}
@Then("verifies the page title")
public void verifies_the_title_page()
{
	String s=driver.getTitle();
	System.out.println(s);
	Assert.assertTrue(s.equals("Home"));
}
	

}
