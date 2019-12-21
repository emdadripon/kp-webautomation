package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetCare {

    @FindBy(how = How.XPATH, using = "//nav[@id='logged_out_topnav']/ul/li[5]/a")
    public WebElement getCardbtn;

    @FindBy(how =How.LINK_TEXT, using = "About KP")
    public WebElement aboutKPLink;


    public WebElement aboutKpbtn;
    public void clickOnGetCare(){
        getCardbtn.click();
    }

    public void clickOnAboutKPLink(){

    }

}
