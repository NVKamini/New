package org.handling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kamini\\eclipse-workspace\\WindowHandling\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/windows");
	driver.manage().window().maximize();
	//windowHandling
	driver.findElement(By.id("home")).click();
	//switch to previous window
   String parId = driver.getWindowHandle();
	Thread.sleep(3000);
	Set<String> windowHandles = driver.getWindowHandles();
	for(String a:windowHandles) {
		if(parId.equals(parId)) {
			driver.switchTo().window(a);
			Thread.sleep(2000);
			driver.switchTo().window(parId);
			Thread.sleep(2000);
		}
		
	}
	driver.findElement(By.id("multi")).click();
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String> li =new ArrayList();
	li.addAll(windowHandles2);
	Thread.sleep(3000);
	driver.switchTo().window(li.get(3));
}
}
