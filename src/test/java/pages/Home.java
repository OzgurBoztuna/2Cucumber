package pages;

import io.cucumber.messages.types.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;


public class Home extends BrowserUtils {
    public Home() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

  @FindBy(xpath = "//a[text()='Add Tariff Plan']")
  public WebElement open;



    public void open(){
        open.click();
    }

        }