import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGADESHAN R\\eclipse\\jaga\\Selenium\\driver\\chromedriver.exe");	
    WebDriver drive = new ChromeDriver();
    drive.get("https://www.facebook.com");
    WebElement usr =drive.findElement(By.xpath("//select[@id='day']"));
    usr.sendKeys("15");
	WebElement gen = drive.findElement(By.xpath("//input[@value='2']"));
	gen.click();
	}

}
