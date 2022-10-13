package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatabasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class EditorDatatablesStepDefinitions {

    DatabasePage databasePage=new DatabasePage();
    Actions actions=new Actions(Driver.getDriver());



    @Then("new butonuna basar")
    public void newButonunaBasar() {
        databasePage.newButonu.click();
    }
    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String isim) {
        databasePage.firstName.sendKeys(isim);
    }
    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String soyisim) {
       actions.sendKeys(Keys.TAB).sendKeys(soyisim).perform();
    }
    @And("position bolumune {string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }
    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String ofis) {
          actions.sendKeys(Keys.TAB).sendKeys(ofis).perform();
    }
    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();

    }


    @And("Start date bolumune {string}  girer")
    public void startDateBolumuneGirer(String date) {
        databasePage.date.sendKeys(date);


    }

        @And("Salary bolumune {string} girer")
        public void salaryBolumuneGirer(String salary) {

        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
            actions.sendKeys(Keys.TAB).perform();


        }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).perform();

        databasePage.createButon.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        databasePage.searchBox.sendKeys(firstname);

    }


    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        String expectedName=firstname;
        String actualName=databasePage.nameGorunum.getText();
        Assert.assertTrue(actualName.contains(expectedName));

    }
}
