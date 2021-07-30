package selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://in.yahoo.com/");
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("selenium");
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium interview questions")) {
				list.get(i).click();
				break;
			}
		}
		
		
		

	}

}
