
Feature: : US09 OdevBRC

  @BRC
  Scenario Outline: : TC11 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "blueRentaCarUrl" ana sayfasinda
    Then Login yazisina tiklar
    And "<gecersizEmail>" username girer
    And "<gecersizPass>" password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 3 saniye bekler
    And  sayfayi kapatir

    Examples: :
  | gecersizEmail   | gecersizPass |
  |a@gmail.com      |    12346|
  |b@gmail.com      |    13246|
  |c@gmail.com      |    78974|
  |d@gmail.com      |    78564|
  |e@gmail.com      |    41454|