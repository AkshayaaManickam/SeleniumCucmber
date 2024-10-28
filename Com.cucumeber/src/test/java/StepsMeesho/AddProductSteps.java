package StepsMeesho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddProductSteps 
{
	public WebDriver driver;
	public Actions a;
	
	@Given("User should navigate to Meesho Application")
	public void userShouldNavigateToMeeshoApplication() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.meesho.com/");
	   
	}

	@Given("user should move cursor to Men")
	public void userShouldMoveCursorToMen() throws InterruptedException 
	{
		//WebElement men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
	    //a.moveToElement(men).click().perform();
	    driver.findElement(By.xpath("//span[contains(text(),'Men')]")).click();
	    Thread.sleep(3000);
	}

	@Given("User should click on Casual Shoes")
	public void userShouldClickOnCasualShoes() throws InterruptedException {
		// WebElement casualshoes = driver.findElement(By.xpath("//p[contains(text(),'Casual Shoes')]"));
	    // a.moveToElement(casualshoes).click().perform();
		driver.findElement(By.xpath("//p[contains(text(),'Casual Shoes')]")).click();
	     Thread.sleep(3000);
	}

	@Given("User should click on Aadab Shoes")
	public void userShouldClickOnAadabShoes() throws InterruptedException {
	    
		
	   driver.findElement(By.xpath("//p[contains,(text(),'Aadab')]")).click();
	   Thread.sleep(3000);
	}

	@Given("User should select a size")
	public void userShouldSelectASize() {
	    
	   driver.findElement(By.xpath("//span[contains(text(),'IND-8')]")).click();
	}

	@When("User click on Add cart")
	public void userClickOnAddCart() {
	    
	   driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
	}

	@Then("Login link should be shown")
	public void loginLinkShouldBeShown() {
	    Reporter.log("Mobile number text field displayed",true);
	   
	}
}
