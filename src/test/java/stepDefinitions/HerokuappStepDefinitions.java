package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepDefinitions {

 HerokuappPage herokuappPage=new HerokuappPage();
    @And("{string} butona basin")
    public void butonaBasin(String AddElementButonu) {
        herokuappPage.addElementButonu.click();

    }

    @And("{string} butonu gorunur oluncaya kadar bekleyin")
    public void butonuGorunurOluncayaKadarBekleyin(String delete) {
       ReusableMethods.waitForVisibility(herokuappPage.deleteButonu,3);


    }

    @And("{string} butonunun gorunur oldugunu test edin")
    public void butonununGorunurOldugunuTestEdin(String delete) {
       Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
       herokuappPage.deleteButonu.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
       Assert.assertTrue(herokuappPage.deleteButonuList.size()==0);

    }
}
