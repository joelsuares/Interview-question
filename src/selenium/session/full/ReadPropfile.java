package selenium.session.full;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class ReadPropfile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream is = new FileInputStream(
				"C:\\Users\\Joel\\eclipse-workspace\\test selenium\\src\\selenium\\session\\full\\config.properties");

		prop.load(is);
		String browsername = prop.getProperty("browser");

		System.out.println(browsername);

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("internetexploer")) {
//			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
//			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
		}

		driver.get(prop.getProperty("URL"));

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		

	}

}
