
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String args[]) {
		write2file();
		Properties prop = readFile();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		System.out.println("enter 1/2 for opencart/automationsite ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();

		ArrayList<WebElement> openCartList = new ArrayList<>();
		ArrayList<WebElement> automationList = new ArrayList<>();

	
		if (i == 1) {
			openCartList.add(objDriver.findElement(By.xpath("//*[@id='input-email']")));
			openCartList.add(objDriver.findElement(By.xpath("//*[@id=\'input-password\']")));
			openCartList.add(objDriver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input")));
			openCartList.add(objDriver.findElement(By.xpath("//*[@id=\'account-login\']/div[1]")));
			System.out.println(runscripts("https://demo.opencart.com/index.php?route=account/login", objDriver,
					openCartList, prop.getProperty("login1"), prop.getProperty("password1")));
		}
		else {
			automationList.add(objDriver.findElement(By.xpath("/html/body/div/div/div[2]/input")));
			automationList.add(objDriver.findElement(By.xpath("/html/body/div/div/div[3]/input")));
			automationList.add(objDriver.findElement(By.xpath("//*[@id=\'enterbtn\']")));
			automationList.add(objDriver.findElement(By.xpath("//*[@id=\'errormsg\']")));

			System.out.println(runscripts("http://demo.automationtesting.in/SignIn.html", objDriver,
					automationList, prop.getProperty("login2"), prop.getProperty("password2")));
		}
	}

	public static void write2file() {
		try (OutputStream output = new FileOutputStream("config.properties")) {
			Properties prop = new Properties();
			// set the properties value
			prop.setProperty("login1", "login1@gmail.com");
			prop.setProperty("password1", "password1");
			prop.setProperty("login2", "login2@gmail.com");
			prop.setProperty("password2", "password2");
			// save properties to project root folder.
			prop.store(output, null);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	public static Properties readFile() {
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("config.properties")) {
			prop.load(input);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prop;
	}

	public static String runscripts(String url, WebDriver driver, ArrayList<WebElement> elementList, String username,
			String password) {
		driver.get(url);
		elementList.get(0).sendKeys(username);
		elementList.get(1).sendKeys(password);
		elementList.get(2).click();
		return elementList.get(3).getText();
	}

}
