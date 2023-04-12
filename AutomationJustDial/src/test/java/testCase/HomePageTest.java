package testCase;

import testBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class HomePageTest extends WebTestBase {
	    HomePage homepage;
	    MouseHoverPage mousehoverpage;
	    MoviesPage moviespage;
	    IframePage iframepage;

	    public HomePageTest(){
	        super();
	    }
	    @BeforeMethod
	    public void beforeMethod(){
	        initialization();
	        homepage=new HomePage();
	        mousehoverpage=new MouseHoverPage();
	        moviespage=new MoviesPage();
	        iframepage=new IframePage();
	       }
	    
	    @Test(priority = 1)
	    public void verifyMouseHoverFunction(){
	        SoftAssert softassert=new SoftAssert();
	        mousehoverpage.mouseHover();
	        mousehoverpage.getfindElement();
	        softassert.assertAll();
	    }
	    @Test(priority = 0)
	    public void verifySearchingFunctinality(){
	        SoftAssert softassert=new SoftAssert();
	        homepage.search(prop.getProperty("cityname"),prop.getProperty("productname"));
	        softassert.assertAll();
	    }
	  
	    @Test(priority = 2)
	    public void verifyDropDownFunction()throws InterruptedException{
	        SoftAssert softassert=new SoftAssert();
	        moviespage.clickElement("Hindi");
	        softassert.assertAll();
	    }
	    @Test(priority = 6)
	    public void veryfyIFrame()throws InterruptedException{
	        iframepage.iFrame();
	    }
	  
	    @Test(priority = 4)
	    public void verifyWindowHandlesFunction()throws InterruptedException{
	    
	       iframepage.windowHandleMethod();
	    } 
	    @Test(priority = 3)
	    public void verifyCookiesMethods(){
	        iframepage.getcookiesMethod();   
	    }
	    @Test(priority = 7) 
	    public void verifySelectDisplayFunction(){
	        iframepage.isDisplayed();
	    } 
	    @Test(priority = 5) 
	    public void verifyScrollDownAndClick(){
	        iframepage.isSelectMethod();
	    } 
	  
	    @AfterMethod
	    public void afterMethod(){
	        driver.close();
	    }

}
