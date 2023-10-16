package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class homePage extends Connector{
	
	
	public homePage(String url) {
		this.url = url;
	}
	
	public void searchJob() throws InterruptedException {
		List<String> province = new ArrayList<String>();
		WebDriver driver = Connect(url);
		Thread.sleep(4000);
		try {
    		driver.findElement(By.xpath("//*[@id=\"modal-brand-communication\"]/div/div/div[1]/button")).click();
    	} catch (Exception e) {
    		System.out.println("not include promotion video");
    	}
		
		//fill the keyword
		driver.findElement(By.id("keyword")).sendKeys("automation");
		
		//find the dropdown
		Select dropdown = new Select(driver.findElement(By.id("city")));

		dropdown.selectByVisibleText("Ninh Bình");
		//Get all options
	    List<WebElement> dd = dropdown.getOptions();

	    //Get the length
	    System.out.println(dd.size());

	    // Loop to print one by one
	    for (int j = 0; j < dd.size(); j++) {
//	        System.out.println(dd.get(j).getText());
	        province.add(dd.get(j).getText());

	    }
	    
	    //Select
	    
	    Thread.sleep(4000);
	    driver.quit();
	}

}
