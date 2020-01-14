package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://google.com/");
		objDriver.manage().window().maximize();
		objDriver.findElement(By.xpath("//*[@id = \'searchBtn\']"));
		System.out.println(objDriver.switchTo().alert().getText());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		objDriver.switchTo().alert().accept();
		objDriver.quit();
	}
}