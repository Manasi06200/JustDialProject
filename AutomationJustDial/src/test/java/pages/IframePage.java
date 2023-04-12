package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class IframePage extends WebTestBase {
	
	@FindBy(tagName ="iframe")
    List<WebElement> iframe;
	
	@FindBy(xpath="//figcaption[@class='color111 font14 pt-10']")
    WebElement loginbtn;
	
	@FindBy(xpath="//div[@class='font16 color111 fw500 home_billtravel_subtxt']")
    WebElement clickOnMobiletap;
	
	@FindBy(id="Featured_Cards")
    WebElement checkbox;
	
	
	@FindBy(xpath="//a[@title='Justdial on Youtube']")
    WebElement youtubeicon;
	
	public IframePage() 
	{
        PageFactory.initElements(driver, this);
    }
	
	 public void iFrame() throws InterruptedException {
	        Utility.iFameHandle(iframe);
	    }
	 
	 public void isDisplayed(){
	       System.out.println(loginbtn.isDisplayed());
	    }
	 
	 public void isSelectMethod(){
	        Utility.ScrollDown(driver);
	        clickOnMobiletap.click();
	        Utility.ScrollDown(driver);
	    }
	 public void getcookiesMethod(){
	        Utility.fetchingCookies(driver);
	    }
	 
	 public void windowHandleMethod()throws InterruptedException{
	        Utility.ScrollDown(driver);
	        youtubeicon.click();
	        Utility.getwindowHandle(driver);

	    }
	    
	    

}
