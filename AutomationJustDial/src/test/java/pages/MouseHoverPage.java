package pages;

import testBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MouseHoverPage extends WebTestBase {
	
    @FindBy(xpath="//div[text()='PG/Hostels']")
    WebElement clickon;

    @FindBy(xpath="//button[text()='Popular Categories']")
    WebElement mousehover;

    @FindBy(xpath="//div[@class='jdlogo']")
    WebElement findelement;


    public MouseHoverPage(){
        PageFactory.initElements(driver, this);
    }

    public void mouseHover(){
        clickon.click();
        //ActionClass.moveToElement(driver,mousehover);
    }
   
    public String getfindElement(){
       return findelement.getText();
    }


}
