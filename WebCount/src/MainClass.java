import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");
		WebElement laptoplink = objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
		((JavascriptExecutor) objDriver).executeScript("arguments[0].click();", laptoplink);
		List<WebElement> links = objDriver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement link : links)
			System.out.println(link.getAttribute("href"));
	}
}