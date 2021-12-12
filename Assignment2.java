package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
		public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	
		driver.findElement(By.id("firstNameField")).sendKeys("BalaVignesh");
		driver.findElement(By.id("lastNameField")).sendKeys("Pitchai");
		
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("10/28/1997");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Aerospace");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("training session");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("balanalan2017@gmail.com");
		
		WebElement elaDropDown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select cel=new Select(elaDropDown);
		cel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("training session");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		}
		

}
