package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DemoPage;
import utilities.Driver;

public class DemoDtepDefinitions {
    DemoPage demoPage=new DemoPage();
    Actions actions=new Actions(Driver.getDriver());
    @When("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN);

    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {
    }

    @And("kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
    }
}
