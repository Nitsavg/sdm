package login;

//import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// Verify the time taken to login with a valid username and password
		System.setProperty("webdriver.chrome.driver",  "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://vinayavish.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.name("login")).sendKeys("RK77");
		
		driver.findElement(By.name("password")).sendKeys("Rk@7665275");
		
		driver.findElement(By.xpath("//*[@id=\"stm-lms-login\"]/div[2]/div[3]/a")).click();
		
		
		
	}

}
