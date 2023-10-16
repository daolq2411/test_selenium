package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
//		 
//	    WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        
//        driver.navigate().to("https://www.topcv.vn/");
//        
//        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[2]/li[1]/a[1]")).click();
        String[] list_user = {"lequangdao98@gmail.com", "abccvbdf", "123455"};
        String[] list_pass = {"daocoi08", "1", "abc!!!"};
//        for(int i=0; i<3; i++) {
//        	String User = list_user[i];
//        	String Pass = list_pass[i];
//        	try {
//        		driver.findElement(By.xpath("//*[@id=\"modal-brand-communication\"]/div/div/div[1]/button")).click();
//        	} catch (Exception e) {
//        		System.out.println("not include video promotion");
//        	}
//        	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys(User);
//        	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys(Pass);
//        	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")).click();
//        }
//        driver.quit();
		Login login = new Login("https://www.topcv.vn/");
		login.loginWithData(list_user, list_pass);
	}

}
