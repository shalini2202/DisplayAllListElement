package com.displayAllListElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		WebElement ul_Element = driver.findElement(By.xpath(".//*[@class = 'be-tabs-snipe clearfix']"));
		List<WebElement> list_All = ul_Element.findElements(By.tagName("li"));
		
		for(WebElement e : list_All)
		{
			System.out.println(e.getText());
		}
		
		
	}

}
