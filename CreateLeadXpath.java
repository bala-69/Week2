package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("infosearch");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("BalaVignesh");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Pitchai");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("balanalan2017@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6385925981");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();


}
}