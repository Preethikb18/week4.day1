package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	      ChromeDriver driver =new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.switchTo().frame(0);
		   driver.findElement(By.xpath("//a[text()='Kids'"));
		   
		
		
		
	}

}
