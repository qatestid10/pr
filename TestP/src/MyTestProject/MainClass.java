package MyTestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainClass {

	public static void main(String[] args) {
		
		
		System.out.println("Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\John Robert\\Desktop\\lib\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		options.addArguments("--ignore-certificate-errors");
                     options.addArguments("--disable-popup-blocking");
	WebDriver driver = new ChromeDriver(options);

		
		
		
		
		driver.get("https://mail.google.com/mail/u/0/");
		
		driver.close();
		driver.quit();

	}

}
