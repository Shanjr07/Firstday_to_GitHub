import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newpro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGADESHAN R\\eclipse\\jaga\\Selenium\\driver\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		driv.get("https://www.twitter.com/login");
		WebElement text=driv.findElement(By.xpath("//input[@class='js-username-field email-input js-initial-focus']"));
		text.sendKeys("jagade");
		WebElement pass=driv.findElement(By.xpath("//input[@class='js-password-field']"));
		pass.sendKeys("jagade");
		WebElement textt = driv.findElement(By.xpath("//h1[contains(text(),'Log')]"));
		String a= textt.getText();
		System.out.println(a);
		String b = pass.getAttribute("value");
		System.out.println(b);
		driv.quit();
		
		

	}

}