package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {

        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {

        Assert.assertTrue(amazonPage.aramaSonucElementi.isDisplayed());
    }


    @Then("Kullanici selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);
    }

    @And("sonuclarin selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucElementi.isDisplayed());
    }


    @Then("Kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {

        Assert.assertTrue(amazonPage.aramaSonucElementi.isDisplayed());
    }


    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime, Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @When("url'nin {string} icerdigini test edelim")
    public void urlNinIcerdiginiTestEdelim(String istenenUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenUrl));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {

            try {
                Thread.sleep(istenenSure * 1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


    }
}