@auto
Feature: US016 kullanici giris testi

  Scenario: TC14 kullanici sitede hesap olusturur


    Given kullanici "AutomationPracticeUrl" sayfasina gider
    And  kullanici user sign in linkine tiklar
    And  kullanici user Create and account bölümüne email adresi girer
    And  kullanici Create an Account butonuna basar
    And  kullanici  user kisisel bilgilerini ve iletisim bilgilerini girer
    And  kullanici  user Register butonuna basar
    Then hesap olustugunu dogrulayin

