package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleinterview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://vladimirwork.github.io/web-ui-playground/");
		WebElement lit = driver.findElement(By.name("FirstName"));
		lit.sendKeys("Nusrath");
		driver.findElement(By.name("LastName")).sendKeys("Ahmed");
		driver.findElement(By.name("Email")).sendKeys("nusrath009@gmail.com");
		driver.findElement(By.name("PhoneNumber")).sendKeys("9739903300");
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("Agreement")).click();
		driver.findElement(By.name("submitbutton")).click();
		
		
		
	}

}
