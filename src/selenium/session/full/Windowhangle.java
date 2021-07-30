package selenium.session.full;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();

		Iterator<String> itr = s.iterator();

		while (itr.hasNext()) {
			String child = itr.next();
			
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				
				driver.close();
			}
			
			driver.switchTo().window(parent);
		}
	}

}
