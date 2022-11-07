package com.app.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	
 public static void brwoserlaunch()
 {
	 WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 
 }
 
 public static WebElement findwebelement(By by)
 {
	 return driver.findElement(by);
 }
 
 public static void click(WebElement element)
 {
	 element.click();
 }
 
 public static void sendkeys(WebElement element, String data)
	{
		element.sendKeys(data);
	}
 public static void url(String url)
 {
	 driver.get(url);
 }
 public static String properties(String link) throws IOException
 {
	 FileReader f = new FileReader("C:\\Users\\rajit\\eclipse-workspace\\cucumber\\src\\"
	 		+ "main\\resources\\Properties\\Test.properties");
	 Properties p = new Properties();
	 p.load(f);
	 String linkurl = p.getProperty(link); 
	 System.out.println(linkurl);
	 return linkurl;
 }
}
