package PageTests;

import base.CommonAPi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GetCare;
import pages.WhykpPage;

import java.nio.channels.SelectableChannel;

public class GetCarePageTests extends CommonAPi {

    @Test(enabled = false)
    public void verifyGetCareLink() throws InterruptedException {
        WhykpPage whykpPage = PageFactory.initElements(driver, WhykpPage.class);
        whykpPage.clickonWhyKP();
        WebElement element = driver.findElement(By.xpath("//ul[@id='get_care']/li[1]/a[1]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'Convenient ways to get care')]")).isDisplayed());

    }

    @Test
    public void goTOGetCarePage(){
        GetCare getCare = PageFactory.initElements(driver, GetCare.class);
        getCare.clickOnGetCare();
    }

    @Test(enabled = true, description = "Verify about KP link")
    public void aboutKP(){
        goTOGetCarePage();
        WebElement element = driver.findElement(By.linkText("About KP"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        //Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(), 'Most influential people in health care')]")).isDisplayed());
    }



}
