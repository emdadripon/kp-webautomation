package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonAPi {

    public  WebDriver driver = null;


    @Parameters({"url"})
    @BeforeMethod
    public void setUp(ITestContext ctx, @Optional("true") String url) throws MalformedURLException {
      /*  String host = "localhost";
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        if (System.getProperty("BROWSER") != null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
            dc = DesiredCapabilities.firefox();
        }
        if (System.getProperty("HUB_HOST") !=null){
            host = System.getProperty("HUB_HOST") ;
        }
        String testName = ctx.getCurrentXmlTest().getName();
        String completeURL = "http://" + host + ":4444/wd/hub";
        dc.setCapability("name", testName);
        driver = new RemoteWebDriver(new URL(completeURL), dc);*/
        System.setProperty("webdriver.chrome.driver", "/Users/emdadripon/Documents/driver/chromedriver-3");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void scroling(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    @AfterMethod
    public void tearDown(){

        //driver.quit();
    }
}
