package javascript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class javacriptexcutorconcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");

		WebElement element = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		WebElement forgotpassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));

		flash(element, driver); // highlight the element
		drawborder(element, driver); // draw border

		// take screenshot
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screen shot to desired location ussing copyfile
		FileUtils.copyFile(scrFile, new File("D:\\screenshot\\element.png"));

		// generate method
//		generatealert(driver, "there is a issue with login button on login page");

		// click on any element using javascript executor
		clickElementbyJS(element, driver);

		// refresh the page
//		1. driver.navigate().refresh();

		// by using the js
		
		refreshbrowserbyjs(driver);
		
		//get the title of the page by js 
		String gettitlebyJs = gettitlebyJs(driver);
		System.out.println(gettitlebyJs);
		
		//to get the inner text 
		String innertext = innertext(driver);
		System.out.println(innertext);
		
		//scroll down method 
//		scrollpagedown(driver);
		
		//scroll into view 
		scrollintoview(forgotpassword, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolour = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changecolor("rgb(0,200,0)", element, driver);
			changecolor(bgcolour, element, driver);
		}
	}

	public static void changecolor(String colour, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + colour + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	public static void drawborder(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generatealert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementbyJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}
	
	public static void refreshbrowserbyjs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
		
	}
	
	public static String gettitlebyJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String innertext(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String innertxt = js.executeScript("return document.documentElement.innerText").toString();
		return innertxt;
	}
	
	public static void scrollpagedown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollintoview(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	

}
