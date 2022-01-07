package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LogInPageSelenium {


	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("jawahar");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
    WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select dropdown = new Select(drop);
    dropdown.selectByValue("LEAD_EMPLOYEE");
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("manoj");
    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/01/1997");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("civil");
    WebElement drop1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dropdown1 = new Select(drop1);
	dropdown1.selectByValue("OWN_PARTNERSHIP");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
	WebElement drop2 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select dropdown2 = new Select(drop2);
	dropdown2.selectByIndex(23);
	driver.findElement(By.name("submitButton")).click();
	driver.close();
	}}

	