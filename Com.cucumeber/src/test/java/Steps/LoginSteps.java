package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps
{
	WebDriver driver;
	/**
	@Given("user should navigate to demowebShop application")
	public void userShouldNavigateToDemowebShopApplication()
	{
	 driver=new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/books");
	}
	
	
	@Given("user should click on login link")
	public void userShouldClickOnLoginLink() 
	{
	    driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}


   @Given("user should Enter username as {string}")
   public void userShouldEnterUsernameAs(String username) 
   {
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
   }
   
   @Given("user should enter the password as {string}")
   public void userShouldEnterThePasswordAs(String password) {
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
       
   }

	@When("user click on login button")
	public void userClickOnLoginButton() {
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}

	@Then("login should be successfull")
	public void loginShouldBeSuccessfull()
	{
	    driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

	@Then("login should not be successfull")
	public void loginShouldNotBeSuccessfull() {
		String result = driver.findElement(By.xpath("//a[@class='ico-login']")).getText();

		Assert.assertEquals("Log in",result);
	}
	*/
	
	
	
	@Given("user should navigate to demowebShop application")
	public void userShouldNavigateToDemowebShopApplication()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
	}

	@Given("user should click on login link")
	public void userShouldClickOnLoginLink() 
	{
		 driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}

	@Given("user should Enter username as {string}")
	public void userShouldEnterUsernameAs(String username) {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
	}

	@Given("user should enter the password as {string}")
	public void userShouldEnterThePasswordAs(String password)
	{
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);   
	}

	@Given("user click on login button")
	public void userClickOnLoginButton() 
	{
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}

	@Given("user should click on Digital Downloads link")
	public void userShouldClickOnDigitalDownloadsLink() 
	{
	   driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click(); 
	}

	@When("user add one product to cart")
	public void userAddOneProductToCart() 
	{
	   driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("product should added to cart")
	public void productShouldAddedToCart()
	{
	    driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
}
