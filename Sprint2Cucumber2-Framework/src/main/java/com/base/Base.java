package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public static WebDriver driver;
	public static Properties prop;

	public Base() 
	{
		prop = new Properties();
		try {
			PageFactory.initElements(driver, this);
			FileInputStream fis = new FileInputStream("./src/main/java/com/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File not found Exception!");
		} catch (IOException e) {
			System.out.println("Unable to read the file");
		}
	}
	
	public void initialization() 
	{
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		String url = prop.getProperty("actURL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void teardown() 
	{
		driver.quit();
	}

}