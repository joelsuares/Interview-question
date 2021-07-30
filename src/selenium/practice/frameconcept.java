package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameconcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(300);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[contains(.,'Contacts')]")).click();

	}

}
