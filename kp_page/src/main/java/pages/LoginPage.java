package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using = "userid")
    public WebElement uid;

    @FindBy(how = How.ID, using = "password")
    public WebElement pass;

    @FindBy(how = How.ID, using = "Submit")
    public WebElement submitbtn;

    public void login(){
        uid.sendKeys("emdadripon");
        pass.sendKeys("$Ctg1025");
        submitbtn.click();
    }
}
