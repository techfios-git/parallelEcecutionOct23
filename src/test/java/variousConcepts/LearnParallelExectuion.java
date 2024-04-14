package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LearnParallelExectuion {

	public WebDriver driver;

	@Test
	public void FirefoxTest() {

		System.out.println("The thread ID for Edge is " + Thread.currentThread().getId());
		System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://cert.codefios.com/login");
		
		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo2@codefios.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();

	}

	@Test
	public void ChromeTest() {

		System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://cert.codefios.com/login");
		
		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo2@codefios.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
	}

}
