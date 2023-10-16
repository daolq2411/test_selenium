package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String[] list_user = {"lequangdao98@gmail.com", "abccvbdf", "123455"};
        String[] list_pass = {"daocoi08", "1", "abc!!!"};
      
//		Login login = new Login("https://www.topcv.vn/");
//		login.loginWithData(list_user, list_pass);
		homePage home = new homePage("https://www.topcv.vn/viec-lam");
		home.searchJob();
	}

}
