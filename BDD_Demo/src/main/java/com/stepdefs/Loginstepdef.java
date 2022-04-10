package com.stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdef {

	WebDriver driver;

	// Cucumber annotations---> Hooks in Cucumber
	@Before
	public void setUp() { // this will run before every scenario
		System.setProperty("webdriver.chrome.driver", "D://Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	

	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		driver.get("file:///D:/JBK%20Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}

	
	/*
	 * @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$") public void
	 * user_enters_and(String uname, String pass) throws Throwable {
	 * driver.findElement(By.id("email")).sendKeys(uname);
	 * driver.findElement(By.id("password")).sendKeys(pass);
	 * driver.findElement(By.xpath("//button")).click(); }
	 */
	
	/*  // Login with data table method 
	 * @When("^user enters valid credentials$") public void
	 * user_enters_valid_credentials(DataTable credentials) throws Throwable {
	 * List<List<String>> data = credentials.raw();
	 * driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
	 * driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	 * driver.findElement(By.xpath("//button")).click(); }
	 */
	// Login with data table method with header - Map table
	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials(DataTable credentials) throws Throwable {
		List<Map<String,String>> data = credentials.asMaps(String.class, String.class);
		  driver.findElement(By.id("email")).sendKeys(data.get(0).get("user"));
		  driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		  driver.findElement(By.xpath("//button")).click(); 
		
	   
	}
	@Then("^user should be on home pages$")
	public void user_should_be_on_home_pages() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
		driver.close();
	}

	@Then("^user should see JBK logo$")
	public void user_should_see_JBK_logo() throws Throwable {
		driver.findElement(By.tagName("img"));
	}

	@Then("^user should see Users$")
	public void user_should_see_Users() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();

	}

}
