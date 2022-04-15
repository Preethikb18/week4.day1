package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("//img[@width='15']")).click();
		//Handlimg different windows
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> lstHandles1 = new ArrayList <String>(windowHandles);
		 String string = lstHandles1.get(1);
		 driver.switchTo().window(lstHandles1.get(1));
		 //Clicking the widget of from
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 driver.switchTo().window(lstHandles1.get(0));
		 //Clicking the widget of to
		 driver.findElement(By.xpath("(//img[@width='15'])[2]")).click();
		 Set<String> windowHandles2 = driver.getWindowHandles();
		 List<String> lstHandles2 = new ArrayList<String>(windowHandles2);
		 driver.switchTo().window(lstHandles2.get(1));
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		 driver.switchTo().window(lstHandles2.get(0));
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 //Handing Alert box
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  System.out.println(driver.getTitle());

	}

}
