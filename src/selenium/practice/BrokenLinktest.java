package selenium.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinktest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.daijiworld.com/");

		// links r assosicated with a tag //a href<http://www.google.com>
		// images r assosicated with img tag //img href <http://www.test.com>

		// 1. get the list of all the links and images

		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));

		System.out.println("the size of  links and images " + linkslist.size());

		List<WebElement> activelink = new ArrayList<WebElement>();

		// 2.iterate linklist, exculde all the link which doesnt have a href attribute

		for (int i = 0; i < linkslist.size(); i++) {

			System.out.println(linkslist.get(i).getAttribute("href"));
			if (linkslist.get(i).getAttribute("href") != null && (!linkslist.get(i).getAttribute("href").contains("javascript"))) {
				activelink.add(linkslist.get(i));

			}
		}
		// get the size of active links

		System.out.println("the size of active links and images " + activelink.size());

		// 3. check the href url with http connection api

		for (int j = 0; j < activelink.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activelink.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response=connection.getResponseMessage(); // ok
			connection.disconnect();
			System.out.println(activelink.get(j).getAttribute("href")+"---->"+response);
		}

	}

}
