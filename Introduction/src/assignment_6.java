import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fdcar\\Downloads\\Automatio\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		
		String optionLabel = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		System.out.println(optionLabel);
		
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		
		staticDropdown.click();
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByValue(optionLabel);
		
		

	}

}
