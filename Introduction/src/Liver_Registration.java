import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Liver_Registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fdcar\\Downloads\\Automatio\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://dev-front.machetalk.jp/liver/");
		driver.manage().window().maximize();
		driver.findElement(By.className("regist")).click();
		driver.findElement(By.name("register_mail")).sendKeys("fdc.adsfadsfasasdfdfaadsfsdf@gmail.com");
		driver.findElement(By.name("register_password")).sendKeys("admin");
		driver.findElement(By.name("register_password_conf")).sendKeys("admin");
		driver.findElement(By.className("btn_next")).click();
		driver.findElement(By.name("register_nickname")).sendKeys("fdc test");
		driver.findElement(By.id("btnProfileImgUpdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("doGetBonus")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.btn_style")).click();
		//driver.quit();	
	}
}
