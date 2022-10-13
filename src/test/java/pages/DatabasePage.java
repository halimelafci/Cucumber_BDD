package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatabasePage {

  public   DatabasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//button[@class='btn']")
  public WebElement createButon;

  @FindBy(xpath = "//input[@id=\"DTE_Field_start_date\"]")
  public WebElement date;

  @FindBy(xpath = "//input[@type=\"search\"]")
  public WebElement searchBox;

  @FindBy(xpath = "//td[@class=\"sorting_1\"]")
  public WebElement nameGorunum;
}
