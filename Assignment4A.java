package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4A {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Button.html");
driver.manage().window().maximize();
driver.findElement(By.id("position")).click();
Thread.sleep(1000);
driver.findElement(By.id("color")).click();
driver.findElement(By.id("size")).click();
	driver.findElement(By.id("home")).click();
	String Text=driver.getTitle();
	System.out.println(Text);
	}

}
