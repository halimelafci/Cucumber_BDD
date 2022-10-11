package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarDefinitions {

   BlueRentaCarPage blueRentaCarPage=new BlueRentaCarPage();
  Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String gidilecekSite) {
        Driver.getDriver().get(ConfigReader.getProperty(gidilecekSite));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentaCarPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
     blueRentaCarPage.email.sendKeys(ConfigReader.getProperty("blueRentaGecersizEmail"));

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
     actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("blueRentaGecersizPassword")).perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
     blueRentaCarPage.login2.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
     Assert.assertTrue(blueRentaCarPage.login2.isDisplayed());
    }




}
