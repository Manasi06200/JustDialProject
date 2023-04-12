package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utils.Utility;
public class MoviesPage  extends WebTestBase{
	
	 @FindBy(xpath="//a[text()='Entertainment']")
	    WebElement elementclick;

	    @FindBy(xpath="//div[@class='movies_lang dropdown flt-scs']")
	    WebElement btnclick;

	   @FindBy(xpath="//ul[@class='dropdown-menu mCustomScrollbar _mCS_2']//div/li/a")
	    List<WebElement> dropdown;

	   @FindBy(id="15365485")
	   WebElement afterselect;

	    
	    public MoviesPage() {
	        PageFactory.initElements(driver, this);
	    }
	    public void clickElement(String value)throws InterruptedException{
	        Utility.ScrollDown(driver);
	        elementclick.click();
	        btnclick.click();
	        Utility.selectValue(dropdown,value);
	    }
	    
	    public String getNextPage(){
	        return afterselect.getText();
	    }

}
