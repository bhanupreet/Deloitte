package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println("Open cart page loaded");
		WebElement obj = objDriver.findElement(By.xpath("//*[@id='input-email']"));
		obj.sendKeys("jeevani-g@gmail.com");
		WebElement obj1 = objDriver.findElement(By.xpath("//*[@id=\'input-password\']"));
		obj1.sendKeys("password");
		WebElement obj2 = objDriver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input"));
		obj2.click();
	}
}
