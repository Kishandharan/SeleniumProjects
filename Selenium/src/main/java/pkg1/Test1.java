package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd1 = new ChromeDriver();
		wd1.get("https://www.youtube.com/");
		wd1.get("https://github.com/");
	}
}
