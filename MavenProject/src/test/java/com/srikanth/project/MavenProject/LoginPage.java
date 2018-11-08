package com.srikanth.project.MavenProject;


import org.testng.annotations.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPage {
	public LoginPage LP;
	public ChromeDriver driver;
	public String baseURL="http://107.170.213.234/catalog/index.php";
	
	@BeforeMethod
	public void OpenBrowser(){
		//driver=new FirefoxDriver();
		System.out.println("Chrome Browser Opening");
		File chromedriver = new File("C:\\Users\\Akula\\Desktop\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
		driver=new ChromeDriver();
		driver.get(baseURL);
		driver.manage().deleteAllCookies();    
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
        driver.manage().window().maximize(); 
	}
	
	@Test
	public void Login(){
	LP=LoginPage.initElements(driver, LoginPage.class);
	LP.Login();
	}
	
	private static LoginPage initElements(ChromeDriver driver2, Class<LoginPage> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	

}

