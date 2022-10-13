package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {

   public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[@onclick=\"addElement()\"]")
    public WebElement addElementButonu;

   @FindBy(xpath = "//button[@class=\"added-manually\"]")
    public WebElement deleteButonu;


    @FindBy(xpath = "//button[@class=\"added-manually\"]")
    public List<WebElement> deleteButonuList;



}
