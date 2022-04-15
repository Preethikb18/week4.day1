package week4.day2;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class DragDropAction {

	public static void main(String[] args) {
		
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver =new ChromeDriver();
      driver.get("https://jqueryui.com/droppable/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.switchTo().frame(0);
      WebElement drag = driver.findElement(By.id("draggable"));
      WebElement drop = driver.findElement(By.id("droppable"));
      Actions builder =new Actions(driver);
      builder.dragAndDrop(drag, drop).perform();
      
      
      

	}

}
