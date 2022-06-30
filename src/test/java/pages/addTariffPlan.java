package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import java.util.Map;

public class addTariffPlan extends BrowserUtils {
    public addTariffPlan() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(xpath = "//input[@id='rental1']")
    private WebElement monthlyRental;

    @FindBy(xpath = "//input[@id='local_minutes']")
    private WebElement freeLocalMinutes;

    @FindBy(xpath = "//input[@id='inter_minutes']")
    private WebElement freeInternationalMinutes;

    @FindBy(xpath = "//input[@id='sms_pack']")
    private WebElement freeSMSPack;

    @FindBy(xpath = "//input[@id='minutes_charges']")
    private WebElement localPerMinuteCharges;

    @FindBy(xpath = "//input[@id='inter_charges']")
    private WebElement internationalPerMinuteCharges;

    @FindBy(xpath = "//input[@id='sms_charges']")
    private WebElement SMSPerCharges;

    @FindBy(xpath = "//input[@value='submit']")
    private WebElement submitButton;

    @FindBy(tagName = "h2")
    private WebElement header2;

    public void headerCheck(String expectedHeader){
        Assert.assertEquals(expectedHeader,header.getText());
    }

    public void fillInputFields(Map<String, String> datatable) {
        monthlyRental.sendKeys(datatable.get("Monthly Rental"));
        freeLocalMinutes.sendKeys(datatable.get("Free Local Minutes"));
        freeInternationalMinutes.sendKeys(datatable.get("Free International Minutes"));
        freeSMSPack.sendKeys(datatable.get("Free SMS Pack"));
        localPerMinuteCharges.sendKeys(datatable.get("Local Per Minutes Charges"));
        internationalPerMinuteCharges.sendKeys(datatable.get("International Per Minutes Charges"));
        SMSPerCharges.sendKeys(datatable.get("SMS Per Charges"));

    }
      public void clickSubmit(){
        submitButton.click();
      }

      public void headerCheck2(String expectedHeader2){
         Assert.assertEquals(expectedHeader2,header2.getText());

      }
}