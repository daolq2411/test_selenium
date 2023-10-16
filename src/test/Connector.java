package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connector {
	public String url;
	public WebDriver Connect(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to(url);
        return driver;
	}
	public void Quit(WebDriver driver) {
		driver.quit();
	}
}
