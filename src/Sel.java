import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGADESHAN R\\eclipse\\jaga\\Selenium\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
driver.manage().window().maximize();
List<WebElement> aa=driver.findElements(By.tagName("frameset"));
int a=aa.size();
System.out.println(a);
driver.switchTo().frame(0);
WebElement dd=driver.findElement(By.name("fldLoginUserId"));
dd.sendKeys("qwert");

//driver.switchTo().frame(0);
//driver.switchTo().frame(1);
WebElement cc=driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
cc.click();


	
	}
}
