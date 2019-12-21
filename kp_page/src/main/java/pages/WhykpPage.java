package pages;

import base.CommonAPi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Iterator;
import java.util.List;

public class WhykpPage extends CommonAPi {

    @FindBy(how = How.LINK_TEXT, using = "Why KP")
    public WebElement whykpbtn;

    @FindBy(how = How.TAG_NAME, using = "img")
    public List<WebElement> imtag;

    @FindBy(how = How.TAG_NAME, using = "a")
    public List<WebElement> linktag;

    @FindBy(how =How.XPATH, using = "//button[contains(text(), 'Shop plans')]")
    public WebElement shopplanbtn;

    public List<WebElement> getImtag(){
        return imtag;
    }

    public void clickonWhyKP(){
        String url;
        whykpbtn.click();
        List<WebElement> image = imtag;
        System.out.println(image.size());
        Iterator<WebElement> it = image.iterator();
        url = it.next().getAttribute("title");
        System.out.println(url);

    }

    public void verifyLink(){
        String url;
        clickonWhyKP();
        List<WebElement> links = linktag;
        System.out.println(links.size());
        Iterator<WebElement> it = links.iterator();
        url = it.next().getAttribute("href");
        System.out.println(url);
    }

    public void scroling(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", shopplanbtn);
        shopplanbtn.click();

    }

}
