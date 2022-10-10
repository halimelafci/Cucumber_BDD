package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class HepsiburadaStepDefinitions {
    @Given("kullanici {string} sayfasina")
    public void kullaniciSayfasina(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
}
