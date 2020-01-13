import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioCount {
	
	
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/Register.html");
//		WebElement laptoplink = objDriver.findElement(By.xpath("//html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
//		((JavascriptExecutor) objDriver).executeScript("arguments[0].click();", laptoplink);
		List<WebElement> links = objDriver.findElements(By.name("radiooptions"));
		System.out.println(links.size());
//		for (WebElement link : links)
//			System.out.println(link.getAttribute("href"));
		
		WebElement checkbox = objDriver.findElement(By.xpath("//*[@id=\'checkbox1\']"));
		
		checkbox.click();
		
		System.out.println(checkbox.isEnabled());
		
		WebElement dropDownMenu = objDriver.findElement(By.xpath("//*[@id=\'Skills\']"));
		Select skill  = new Select(dropDownMenu);
		List<WebElement> list = skill.getOptions();
		for(WebElement element : list) {
			System.out.println(element.getText());
		}
		
		WebElement textelement = objDriver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input"));
		System.out.println(textelement.getAttribute("placeholder"));
		
		WebDriverWait wait = new WebDriverWait(objDriver,10);
//		WebElement ele = wait.until(ExpectedCondition.visibilityOfem)
	}
	
	//wap to accept username and password in a file if user says yes, append it else exit
	// WAP validate the homepage of the opencart and display dropdown menu and capture values (min and max) and display field list names  
}
