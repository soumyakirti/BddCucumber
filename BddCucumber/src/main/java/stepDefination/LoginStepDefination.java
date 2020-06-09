package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefination {

	WebDriver driver;
	

@Given("^user is already on Login Page$")
public void user_is_already_on_Login_Page() throws InterruptedException {
	 //System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
	
	WebDriverManager.chromedriver().setup(); 
	driver = new ChromeDriver();
    
	driver.get("https://ui.freecrm.com/");
    Thread.sleep(5000);
	
}

@When("^title of login page is Free CRM$")
public void title_of_login_page_is_Free_CRM() {
	 String title = driver.getTitle();
	 System.out.println(title);
     Assert.assertEquals("Cogmento CRM", title);
    
}

@Then("^user enters username and password$")
public void user_enters_username_and_password() {
	
	driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("soumya.greeman@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Soumy@25");

}

@Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

}

@Then("^user is on homePage$")
public void user_is_on_homePage() {
	String title = driver.getTitle();
	System.out.println("Home Page Title :"+title);
	Assert.assertEquals("Cogmento CRM", title);
    
}


}


	
	
	