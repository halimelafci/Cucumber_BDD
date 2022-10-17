package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class AutomationStepDefinitions {
    AutoPage autoPage=new AutoPage();
    Faker faker=new Faker();
    Actions actions =new Actions(Driver.getDriver());
    @And("kullanici user sign in linkine tiklar")
    public void kullaniciUserSignInLinkineTiklar() {
        autoPage.login.click();

    }

    @And("kullanici user Create and account bölümüne email adresi girer")
    public void kullaniciUserCreateAndAccountBölümüneEmailAdresiGirer() {
        autoPage.emailBox.sendKeys(faker.internet().emailAddress());

    }

    @And("kullanici Create an Account butonuna basar")
    public void kullaniciCreateAnAccountButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici  user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciUserKisiselBilgileriniVeIletisimBilgileriniGirer() {

        autoPage.radioButton.click();
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys("1").
                sendKeys(Keys.TAB).sendKeys("Mar").sendKeys(Keys.TAB).sendKeys("1990").
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).sendKeys(faker.address().country()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys("kansa").sendKeys(Keys.TAB).
                sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("07100").sendKeys(Keys.TAB).
                sendKeys("United States").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici  user Register butonuna basar")
    public void kullaniciUserRegisterButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesapOlustugunuDogrulayin() {
        Assert.assertTrue(autoPage.myAccountText.isDisplayed());


    }
}
