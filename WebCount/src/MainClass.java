

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	public static void main(String args[]) {
		Properties objProp = new Properties();
		try {
//		objProp.load((new FileInputStream("D:\\Deloitte\\obj.properties");
		}catch(Exception e) {
			
		}
		
		objProp.getProperty("login");
		objProp.getProperty("pwd");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://ksrtc.in/oprs-web");
//		WebElement laptoplink = objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
//		((JavascriptExecutor) objDriver).executeScript("arguments[0].click();", laptoplink);
//		List<WebElement> links = objDriver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//
//		for (WebElement link : links)
//			System.out.println(link.getAttribute("href"));

		objDriver.manage().window().maximize();
		WebElement ele = objDriver.findElement(By.xpath("//*[@id=\'bookingsForm\']/div/div/div[2]/div[3]/button"));
		ele.click();
		System.out.println(objDriver.switchTo().alert().getText());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		objDriver.switchTo().alert().accept();
		objDriver.quit();
	}
	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribate('style','background: yellow; border: 2px solid red;');", element);
	}
	
	//wap to test 2 websites: opencart, automation login1: for open cart
	//login 2 for automation.
	//user should be given the option to select both applications and show forget password button.
}