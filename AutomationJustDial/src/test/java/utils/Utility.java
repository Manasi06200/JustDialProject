package utils;

import org.openqa.selenium.*;

import java.util.*;

public class Utility {
	
	public static final long PAGE_LOAD_TIMEOUT=20;
    public static final long IMPLICITLY_WAIT=30;

    public static void ScrollDown(WebDriver driver) {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,900)");
    }
    public static void selectValue(List<WebElement> list,String value)throws InterruptedException{

        for(WebElement e:list){
        System.out.println( e.getText());
        if(e.getText().equalsIgnoreCase(value)){
            e.click();
            break;
        }
        Thread.sleep(5000);
        }
    }
    public static void getwindowHandle(WebDriver driver)throws InterruptedException{
        String parentWindowID=driver.getWindowHandle();
        Set<String> Window =driver.getWindowHandles();

        for(String w: Window) {
            if(!parentWindowID.contentEquals(w)) {
                driver.switchTo().window(w);
            }
            Thread.sleep(4000);
        }
    }
   
    public static void fetchingCookies(WebDriver driver){
        System.out.println("-----------------------------getCookies--------------------");
    Set<Cookie> cookies =driver.manage().getCookies();

             for(Cookie c:cookies){
                 System.out.println(c);
         }
    }
    public static void iFameHandle(List<WebElement> element)throws InterruptedException{
        System.out.println(element.size());
        for (WebElement e : element) {
            System.out.println(e);
        }

        Thread.sleep(4000);
    }


}
