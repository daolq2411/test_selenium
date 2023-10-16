package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Connector{
	public String[] list_user;
	public String[] list_password;
	public WebDriver driver;
	
	public Login(String url) {
//		this.driver = Connect(url);
		this.url = url;
	}
	
	public void loginWithData(String[] list_user, String[] list_password) throws Exception {
		for(int i=0; i<3; i++) {
			driver = Connect(url);
//			Thread.sleep(10000);
        	String User = list_user[i];
        	String Pass = list_password[i];
        	try {
        		driver.findElement(By.xpath("//*[@id=\"modal-brand-communication\"]/div/div/div[1]/button")).click();
        	} catch (Exception e) {
        		System.out.println("not include video promotion");
        	}
        	driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[2]/li[1]/a[1]")).click();
        	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys(User);
        	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys(Pass);
        	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")).click();
        	Thread.sleep(4000);
        	String currentUrl = driver.getCurrentUrl();
        	System.out.println(currentUrl);
        	if (currentUrl.equals("https://www.topcv.vn/viec-lam")) {
        		System.out.println("True");
        	} else if (currentUrl.equals("https://www.topcv.vn/login")) {
        		System.out.println("False");
        	}
        	driver.quit();
		}
	}
}
