package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr1 = new ChromeDriver();
		
		dr1.manage().window().maximize();
		dr1.get("https://kishandharan.github.io/swfts1/");
		Thread.sleep(2000);
		
		WebElement w1 = dr1.findElement(By.name("search-inp"));
    	WebElement w2 = dr1.findElement(By.name("search-btn"));
		WebElement w3 = dr1.findElement(By.name("dropdown"));
		WebElement w4 = dr1.findElement(By.name("link2"));
		Actions a1 = new Actions(dr1);
		
		w1.sendKeys("apple");
		Thread.sleep(2000);
		
		w2.click(); //Only 2 fruits apple and pineapple 
		Thread.sleep(5000);
		
		a1.moveToElement(w3).perform();
	}
}
