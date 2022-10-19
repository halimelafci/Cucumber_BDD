package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MedunnaPage;

public class MedunnaStepDefinitions {

    MedunnaPage medunnaPage=new MedunnaPage();
    @And("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        medunnaPage.signinSymbol.click();
        medunnaPage.signinButton.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String userName) {
        userName= Faker.instance().name().username();
        medunnaPage.username.sendKeys(userName);
    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String pasWoord) {
        pasWoord=Faker.instance().internet().password();
        medunnaPage.password.sendKeys(pasWoord);
    }

    @Then("signine tiklar")
    public void signineTiklar() {
        medunnaPage.signinWithCredentials.click();
    }

    @And("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {


    }
}
