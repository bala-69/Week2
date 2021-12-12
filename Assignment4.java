package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Edit.html");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("balanalan2017@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@value='Append ']")).clear();
driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("hi");
driver.findElement(By.xpath("//input[@name='username'][1]")).clear();
driver.findElement(By.xpath("//input[@name='username'][1]")).sendKeys("hello");
driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("hai");
driver.findElement(By.xpath("//input[@disabled='true']"));
String title=driver.getTitle();
	System.out.println(title);
	}
}