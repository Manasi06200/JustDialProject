package pages;

import testBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends WebTestBase {
	
	 @FindBy(xpath="//input[@class='input_location font14 fw400 color111']")
	    WebElement location;

	    @FindBy(xpath="//input[@class='input_search font14 fw400 color111']")
	    WebElement element;

	    @FindBy(xpath="//div[@class='jdicon search_white_icon']")
	    WebElement search;

	    public HomePage() {

	        PageFactory.initElements(driver, this);
	    }
	    public void search(String cityname,String productname){
	        location.sendKeys("Mumbai");
	        element.sendKeys("Hotels in Mumbai");
	        search.click();
	    }
	  
}
