package testngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	public static void main(String[] args){
        //set the location of chrome browser from the local machine path 
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        // Initialize browser
        WebDriver driver=new ChromeDriver();       
        driver.get("https://demoqa.com/nestedframes");
        
        //Number of Frames on a Page
        int countIframesInPage =driver. findElements(By. tagName("iframe")). size();
        System.out.println("Number of Frames on a Page:"+countIframesInPage);
        
        //Locate the frame1 on the webPage
        WebElement frame1=driver.findElement(By.id("frame1"));
        
        //Switch to Frame1
        driver.switchTo().frame(frame1);
        
         //Number of Frames on a Frame1
        int countIframesInFrame1 =driver. findElements(By. tagName("iframe")). size();
        System.out.println("Number of Frames inside the Frame1:"+countIframesInFrame1);
        
        //Switch to child frame
        driver.switchTo().parentFrame();
        int countIframesInFrame2 =driver. findElements(By. tagName("iframe")). size();
        System.out.println("Number of Frames inside the Frame2:"+countIframesInFrame2);
        
        //Locate the Element inside the Frame1
        WebElement frame1Element= driver.findElement(By.tagName("body"));
       
        //Get the text for frame1 element
        String frame1Text=frame1Element.getText();
        
        //Try to Print the text present inside parent frame
        System.out.println("Frame1 is :"+frame1Text);
        driver.close();
   }
}
