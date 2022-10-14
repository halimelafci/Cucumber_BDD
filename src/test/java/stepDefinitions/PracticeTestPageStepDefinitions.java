package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefinitions {
    PracticeTestPage practiceTestPage=new PracticeTestPage();
    Actions actions=new Actions(Driver.getDriver());
    int down32Toplam;
    int clickToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresine_gidin(String url) {
        Driver.getDriver().get(url);

    }
    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer clickSayisi) {

        for (int i = 0; i <clickSayisi ; i++) {
            practiceTestPage.clickButonu.click();

        }

    }
    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer space) {
        for (int i = 0; i <space ; i++) {
            actions.sendKeys(Keys.SPACE).perform();

        }


    }
    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {

       List<WebElement> down32list= practiceTestPage.down32;

        for (WebElement each:down32list) {
          down32Toplam+= Integer.parseInt(each.getText().replaceAll("\\D",""));
        }
        System.out.println("down32 toplami :"+down32Toplam);
    }
    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {

        List<WebElement> clickText=practiceTestPage.clickText;
        for (WebElement w:clickText  ) {
          clickToplam+= w.getText().length();

        }
        sonuc = down32Toplam -clickToplam;

        System.out.println("sonuc = " + sonuc);
    }
    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(int result) {

        Assert.assertEquals("sonuc esit degil :",result,(sonuc));

    }

}
