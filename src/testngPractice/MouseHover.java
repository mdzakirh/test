package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Set system properties for geckodriver This is required since Selenium 3.0
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// Launch the URL
		driver.get("https://demoqa.com/menu/");
		System.out.println("demoqa webpage Displayed");

		// Maximise browser window
		driver.manage().window().maximize();

		// Adding wait
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElement 'Main item 2' to perform mouse hover
		WebElement menuOption = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[2]/a"));
		// Mouse hover menuOption 'main item 2'
		actions.moveToElement(menuOption).perform();
		System.out.println("Done Mouse hover on 'Main Menu 2' from Menu");

		// Now Select 'Sub Item' from sub menu which has got displayed on mouse hover of
		// 'Music'
		WebElement subItem = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		// Mouse hover menuOption 'Rock'
		actions.moveToElement(subItem).perform();
		System.out.println("Done Mouse hover on 'sub item' from Main item 2");

		// Now , finally, it displays the desired menu list from which required option
		// needs to be selected
		// Now Select 'Alternative' from sub menu which has got displayed on mouse hover
		// of 'Rock'
//	    	WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
//	    	selectMenuOption.click();
//	    	System.out.println("Selected 'Alternative' from Menu");
		Thread.sleep(5000);
		// Close the main window
		driver.close();
	}

}
