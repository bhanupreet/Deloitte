package com.deloitte.FinalWeek;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Final {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");

		WebElement product = objDriver.findElement(By.xpath("//*[@id=\'menu\']/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
		((JavascriptExecutor) objDriver).executeScript("arguments[0].click();", product);

		WebElement addToCartBtn = objDriver
				.findElement(By.xpath("//*[@id=\'content\']/div[2]/div/div/div[2]/div[2]/button[1]"));
		addToCartBtn.click();

		Thread.sleep(2000);

		WebElement showCartBtn = objDriver.findElement(By.xpath("//*[@id=\'product-category\']/div[1]/a[2]"));
		((JavascriptExecutor) objDriver).executeScript("arguments[0].click();", showCartBtn);

		WebElement currency = objDriver.findElement(By.xpath("//*[@id=\'form-currency\']/div/button"));
		currency.click();
		
		System.out.println("select the currency you want the product to be displayed in ");

		WebElement Euro = objDriver.findElement(By.xpath("//*[@id=\'form-currency\']/div/ul/li[1]/button"));
		System.out.println("1. " + Euro.getText());

		WebElement Dollar = objDriver.findElement(By.xpath("//*[@id=\'form-currency\']/div/ul/li[2]/button"));
		System.out.println("2. " + Dollar.getText());

		WebElement Pound = objDriver.findElement(By.xpath("//*[@id=\'form-currency\']/div/ul/li[3]/button"));
		System.out.println("3. " + Pound.getText());

		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		String value = "";

		try {
			switch (i) {
			case 1:
				Euro.click();
				Thread.sleep(1000);
				break;
			case 2:
				Dollar.click();
				Thread.sleep(1000);
				break;
			case 3:
				Pound.click();
				Thread.sleep(1000);
			default:
				Dollar.click();
				Thread.sleep(1000);
			}
		} catch (Exception e) {

		}

		WebElement totalcost = objDriver
				.findElement(By.xpath("//*[@id=\'content\']/div[2]/div/table/tbody/tr[4]/td[2]"));
		value = totalcost.getText();
		String numericValue = value.replaceAll("[^0-9]", "");

		WebElement currentCurrency = objDriver.findElement(By.xpath("//*[@id=\'form-currency\']/div/button"));
		double currentTotal = Double.parseDouble(numericValue);
		System.out.println("value in : " + currentCurrency.getText() + " = " + currentTotal / 100);

		if (i == 1) {
			double inr = Double.parseDouble(numericValue) * 66.6;
			System.out.println("value in : INR = " + inr / 100);
		} else if (i == 2) {
			double inr = Double.parseDouble(numericValue) * 100;
			System.out.println("value in : INR = " + inr / 100);
		} else {
			double inr = Double.parseDouble(numericValue) * 75;
			System.out.println("value in : INR = " + inr / 100);
		}

		Thread.sleep(10000);

		objDriver.close();
	}
}