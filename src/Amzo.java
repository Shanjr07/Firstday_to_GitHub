import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzo {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGADESHAN R\\eclipse\\jaga\\Selenium\\driver\\chromedriver.exe" );
WebDriver driv= new ChromeDriver();
driv.get("https://www.facebook.com");
WebElement name=driv.findElement(By.id("email"));
name.sendKeys("jaga");
Actions act= new Actions(driv);
act.doubleClick(name).perform();
//act.contextClick(name).perform();
Robot rob = new Robot();
rob.keyPress(KeyEvent.VK_CONTROL);
rob.keyPress(KeyEvent.VK_C);
rob.keyRelease(KeyEvent.VK_CONTROL);
rob.keyRelease(KeyEvent.VK_C);

WebElement pass=driv.findElement(By.id("pass"));
//pass.click();

//ct.doubleClick(pass).perform();
Thread.sleep(1000);
act.contextClick(pass).perform();
for(int i=1;i<=4;i++) {
rob.keyPress(KeyEvent.VK_DOWN);
rob.keyRelease(KeyEvent.VK_DOWN);
}
rob.keyPress(KeyEvent.VK_ENTER);
rob.keyRelease(KeyEvent.VK_ENTER);


WebElement name1= driv.findElement(By.id("email"));
name1.click();
act.doubleClick(name1).perform();
name1.sendKeys("shan");
//act.keyDown(name1, Keys.SHIFT).sendKeys(name,"shan").keyUp(name1,Keys.SHIFT);
TakesScreenshot tss = (TakesScreenshot)driv;
File scr=tss.getScreenshotAs(OutputType.FILE);
File desc = new File("C:\\Users\\JAGADESHAN R\\eclipse\\jaga\\Selenium\\Screenshot\\1st.png");
FileUtils.copyFile(scr,desc);



	}

}
