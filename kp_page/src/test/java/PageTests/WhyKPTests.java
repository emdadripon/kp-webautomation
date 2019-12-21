package PageTests;

import base.CommonAPi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WhykpPage;

public class WhyKPTests extends CommonAPi {

    @Test(enabled = false)
    public void verifyImages() throws InterruptedException {

        WhykpPage whykpPage = PageFactory.initElements(driver, WhykpPage.class);
        whykpPage.clickonWhyKP();

    }

    @Test(enabled = false)
    public void verifyLinks() throws InterruptedException {

        WhykpPage whykpPage = PageFactory.initElements(driver, WhykpPage.class);
        whykpPage.verifyLink();

    }

    @Test(enabled = false)
    public void verifyScroll() throws InterruptedException {
        WhykpPage whykpPage = PageFactory.initElements(driver, WhykpPage.class);
        whykpPage.clickonWhyKP();
        WebElement element = driver.findElement(By.xpath("//button[contains(text(), 'Shop plans')]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

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

    @Test(enabled = true)
    public void verifyFindDocktorsAndLocationLink() throws InterruptedException {
        WhykpPage whykpPage = PageFactory.initElements(driver, WhykpPage.class);
        whykpPage.clickonWhyKP();
        WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'Find Doctors & Locations')]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        Assert.assertTrue(driver.findElement(By.id("regionH1")).isDisplayed());

    }
}

