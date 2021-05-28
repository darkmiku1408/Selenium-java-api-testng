package webdriver;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01_Goplayplay {
WebDriver driver;

@Test
public void TC_01() {
	System.setProperty("webdriver.chrome.driver",
            ".\\Driver\\chromedriver.exe");    
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://goplayplay.net");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("khucanhminh.nguyen@gogame.net");
	driver.findElement(By.xpath("//div[@class='login-input-pass']/input[2]")).sendKeys("Mammuoi123@@");
	driver.findElement(By.xpath("//div[@class='login-button']")).click();
	
	
	
	
}}

