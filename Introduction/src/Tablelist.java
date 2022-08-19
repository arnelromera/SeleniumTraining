import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fdcar\\Downloads\\Automatio\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;

		// maximize window
		driver.manage().window().maximize();
		
		//get url
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//declare arry list
		String [] productName = {"Cucumber", "Mushroom", "Banana", "Corn"};
		
		
		
		//To get the list in the page
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		// for loop to check the list
		for(int i=0; i<products.size(); i++ )
		{
			//Spitting the text
			String [] name = products.get(i).getText().split("-");
			
			//trimming remaing spaces
			String formatedName = name[0].trim();
			List itemNeededList = Arrays.asList(productName);
			
			
			if(itemNeededList.contains(formatedName))
			{
				j++;
				// clicks for the button
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				}
			if(j==productName.length)
			{
				break;
			}
			
		}
		

	}

}
