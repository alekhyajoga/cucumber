package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sc2 {

WebDriver driver;
private CharSequence username;
private CharSequence password;

@Given("^user launches the browser$")
public void user_launches_the_browser() throws Throwable {
   
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	
}

@Given("^user then clicks on the sign in button$")
public void user_then_clicks_on_the_sign_in_button() throws Throwable {
    
	
	driver.findElement(By.linkText("SignIn")).click();
}

@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2) throws Throwable {
	driver.findElement(By .name("userName")).click();
	
	driver.findElement(By .name("userName")).sendKeys(username);
	driver.findElement(By .name("password")).click();
	driver.findElement(By .name("password")).sendKeys(password);
	

    
}

@When("^user clicks on login$")
public void user_clicks_on_login() throws Throwable {

	driver.findElement(By .name("Login")).click();

}

@Then("^user is directed to testme app home page$")
public void user_is_directed_to_testme_app_home_page() throws Throwable {
    
	String act=driver.getTitle();
	String exp="Home";
	if(act==exp)
	{
		System.out.println("Succesful login");
	}
    

}
}
