import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Liver_Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fdcar\\Downloads\\Automatio\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev-front.machetalk.jp/liver/");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.name("login_mail")).sendKeys("rktest4@gmail.com");
		driver.findElement(By.name("login_password")).sendKeys("admin");
		driver.findElement(By.className("btn_style")).click();
		
//		if (driver.findElement(By.id("login_bonus")).isDisplayed())
//		
//			driver.findElement(By.id("doGetBonus")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("button.btn_style")).click();
//		
//	    else if (driver.findElements(By.className("logo").

	    
		
		
		
		//driver.quit();

	}

}

