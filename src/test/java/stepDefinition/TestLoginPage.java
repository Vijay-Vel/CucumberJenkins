package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginPage {
	
	static WebDriver d;
	SharedSteps s;
	
	public TestLoginPage(SharedSteps s)
	{
		this.s=s;
	}
	@Given("the User is on the Demo Web Shop home page")
	public void the_user_is_on_the_demo_web_shop_home_page() {
	    d=s.getDriver();
	    d.get("https://demowebshop.tricentis.com/");
	}

	@Then("the User clicks on the login button on the home page")
	public void the_user_clicks_on_the_login_button_on_the_home_page() {
		
		d.findElement(By.linkText("Log in")).click();
	}

	@When("the User enter email as {string} on the login page")
	public void the_user_enter_email_as_on_the_login_page(String string) {
		d.findElement(By.id("Email")).sendKeys(string);
	    
	}

	@When("the User enter password as {string} on the login page")
	public void the_user_enter_password_as_on_the_login_page(String string) {
		d.findElement(By.id("Password")).sendKeys(string);
	}

	@When("the User clicks on the login button on the page")
	public void the_user_clicks_on_the_login_button_on_the_page() {
	    d.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@When("the User close the page and browser")
	public void the_user_close_the_page_and_browser() {
		
	}
	
	@Then("the user hover Electronics and click on Cell phones")
	public void the_user_hover_electronics_and_click_on_cell_phones() {
		
		WebElement cell = d.findElement(By.xpath("//div[@class='header-menu']/descendant::a[6]"));
		
		Actions a = new Actions(d);
		
		a.moveToElement(cell).build().perform();
		
		d.findElement(By.xpath("//div[@class='header-menu']/descendant::a[8]")).click();
	}

	@Then("the user click on the searched item")
	public void the_user_click_on_the_searched_item() {
	    
	    d.findElement(By.linkText("Smartphone")).click();
	}

	@Then("the user click on add to cart")
	public void the_user_click_on_add_to_cart() {
		d.findElement(By.xpath("//input[@id='add-to-cart-button-43']")).click();
	}
	
}
