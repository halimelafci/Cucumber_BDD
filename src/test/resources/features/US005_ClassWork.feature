
Feature: US1009 Ck Hotels Login


   Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "blueRentaCarUrl" ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    And kullanici 3 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 3 saniye bekler
    And sayfayi kapatir

