package MMT2;



import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.border.EtchedBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MAKEMYTRIP {
	public static String man="https://www.makemytrip.com/";
	ExtentReports er;  //variable creation
	ExtentHtmlReporter ehr;
	ExtentTest et;
	WebDriver driver;
	
		@BeforeTest
		public void bt() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get(man);
			 er=new ExtentReports(); //object creation
				ehr=new ExtentHtmlReporter("extent.html");  
				er.attachReporter(ehr);  
				et=er.createTest("this is before test"); 
				
			 driver.manage().window().maximize();
			 
			 
		}
		@Test(priority = 1)
		public void holidays() throws InterruptedException {
			//Thread.sleep(3000);
			 
//			 driver.switchTo().frame("notification-frame-1730629b2");
//			 Thread.sleep(5000);
//			 driver.findElement(By.xpath("//*[@class='close']")).click();
//			 
	WebElement	HP =driver.findElement(By.linkText("Holiday Packages"));
	Thread.sleep(5000);
	et.pass("user is able to see Holiday Packages");
	HP.click();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	//List<WebElement> cancel= driver.findElements(By.xpath("//*p[@class='primaryBtnWhite border-btn font16 latoBold']"));
	//	driver.findElements(By.xpath("//*p[@class='primaryBtnWhite border-btn font16 latoBold']"));
	// Thread.sleep(5000);
		WebElement city=driver.findElement(By.xpath("//*[@for='fromCity']"));
		Thread.sleep(5000);
		city.click();
		 driver.findElement(By.xpath("//li[contains(text(),'Bangalore')]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("toCity")).click();
		  WebElement toCity = driver.findElement(By.xpath("//input[@class='dest-search-input']"));
		  Thread.sleep(5000);
		  toCity.click();
		  Thread.sleep(5000);
		  toCity.sendKeys("Singapore");
		  Thread.sleep(5000);
		  List<WebElement> sand = driver.findElements(By.xpath("//div[@class='dest-city-name']"));
		  sand.get(0).click();
		  Thread.sleep(5000);
		  List<WebElement> start=driver.findElements(By.xpath("*//p[contains(text(),'20')]"));
		  start.get(1).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[1]/div[4]/div[3]/div[2]/button[2]")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[1]/div[5]/div[2]/div[2]/div[2]/button")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("search_button")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[2]/div/button[1]")).click();
		  Thread.sleep(8000);
		   driver.findElements(By.xpath("//*[@id=\"modalpopup\"]/div/span"));
		  Thread.sleep(8000);
		  JavascriptExecutor js= ((JavascriptExecutor)driver);
	        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div[1]/div/div[2]/div/div/div/div/div[1]")).click();
	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[2]/div[2]/div/button[1]")).click();
//	        Thread.sleep(5000);
//	        driver.navigate().back();
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div[6]/div/div[2]/div/div/div/div/div[1]/div/div/div/div[3]/div/div[1]/div/div/img")).click();
	        Thread.sleep(5000);
	        
		 
		
				 
		 
		 
		
}
}

