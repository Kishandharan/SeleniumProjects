package pkg1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) {
		boolean running = true;
		WebDriver wd1 = new ChromeDriver();
		Scanner sc1 = new Scanner(System.in);
		while(running) {
			System.out.print("url>");
			String url = sc1.nextLine().replace("\n", "");
			if(url.equals("quit")) {
				wd1.close();
				break;
			}
			wd1.get(url);			
		}
	}
}
