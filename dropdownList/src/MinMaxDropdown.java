import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MinMaxDropdown {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");
		WebElement laptoplink = objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
		((JavascriptExecutor) objDriver).executeScript("arguments[0].click();", laptoplink);

		WebElement sortby = objDriver.findElement(By.xpath("//*[@id=\'input-sort\']"));
		Select dropdownselec = new Select(sortby);
		List<WebElement> list = dropdownselec.getOptions();
		System.out.println("min value: " + list.get(0).getText());
		System.out.println("max value: " + list.get(list.size()-1).getText());
	}
}