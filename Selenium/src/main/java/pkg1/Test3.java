package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.name("field-keywords"));
		searchBox.sendKeys("Bendable Monitor");
		searchBox.submit();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
    	js.executeScript("window.scroll(0,6500)");
    	Thread.sleep(5000);
	    WebElement sb = driver.findElement(By.cssSelector("a[aria-label='Go to next page, page 2']"));
	    sb.click();
	}
}
