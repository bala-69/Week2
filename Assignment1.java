package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kodhai");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ramji");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("balanalan2017@gmail.com");
driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("balanalan2017@gmail.com");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Happyday@2017");

WebElement elnDropDown=driver.findElement(By.id("day"));
Select sel=new Select(elnDropDown);
sel.selectByIndex(4);
WebElement elaDropDown=driver.findElement(By.id("month"));
Select del=new Select(elaDropDown);
del.selectByIndex(10);
WebElement elvDropDown=driver.findElement(By.id("year"));
Select cel=new Select(elvDropDown);
cel.selectByIndex(3);

driver.findElement(By.xpath("//label[@class='_58mt']")).click();



	}
}